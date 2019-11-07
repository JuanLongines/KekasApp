package com.longines.kekasapp.activities;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.longines.kekasapp.R;
import com.longines.kekasapp.di.Injector;
import com.longines.kekasapp.interfaces.LoginIterface;
import com.longines.kekasapp.models.Platillo;
import com.longines.kekasapp.presenters.LoginPresenter;

import io.realm.Realm;

public class LoginActivity extends BaseActivity implements LoginIterface.View, View.OnClickListener {

    LoginPresenter presenter;
    Button btnIngreso;
    private EditText edtUser;
    private EditText edtPwd;
    private Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindUI();
        realm = Injector.providesRealm();
        presenter = new LoginPresenter(this);


        Platillo platillo = new Platillo();
        platillo.setId(1);
        platillo.setNombre_platillo("Gordita");
        // Persist your data in a transaction
        realm.beginTransaction();
//        final Platillo managedDog =
        realm.copyToRealm(platillo); // Persist unmanaged objects
//        Person person = realm.createObject(Person.class); // Create managed objects directly
//        person.getDgos().add(managedDog);
        realm.commitTransaction();


    }

    private void bindUI() {
        edtUser = findViewById(R.id.edtUser);
        edtPwd = findViewById(R.id.edtPwd);
        btnIngreso = findViewById(R.id.btnIngreso);
        btnIngreso.setOnClickListener(this);
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void showError(String message) {
        showShortToast(message);
    }

    @Override
    public void startLoading() {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void doLogin() {
        String usuario = edtUser.getText().toString().trim();
        String pwd = edtPwd.getText().toString().trim();
        presenter.doLogin(usuario, pwd);
    }

    @Override
    public void goToHome() {
        next(null, HomeActivity.class, true);
    }

    @Override
    public void onClick(View item) {
        switch (item.getId()) {
            case R.id.btnIngreso:
                doLogin();
                break;
        }
    }
}
