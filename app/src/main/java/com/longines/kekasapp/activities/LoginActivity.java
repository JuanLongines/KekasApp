package com.longines.kekasapp.activities;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.longines.kekasapp.R;
import com.longines.kekasapp.database.KekasDatabase;
import com.longines.kekasapp.di.Injector;
import com.longines.kekasapp.interfaces.LoginIterface;
import com.longines.kekasapp.models.Platillo;
import com.longines.kekasapp.presenters.LoginPresenter;
import com.rengwuxian.materialedittext.MaterialEditText;

import io.reactivex.CompletableObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class LoginActivity extends BaseActivity implements LoginIterface.View, View.OnClickListener {

    LoginPresenter presenter;
    Button btnIngreso;
    //    private Realm realm;
    KekasDatabase db;
    private MaterialEditText edtUser;
    private MaterialEditText edtPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindUI();
        db = Injector.provideRoomDataBase();
        presenter = new LoginPresenter(this);


        final Platillo platillo = new Platillo();
        platillo.setNombre("Gordita");
        platillo.setPrecio("16");
//        PlatilloDao dao = db.getPlatilloDao();
        db.getPlatilloDao().insertAll(platillo).subscribeOn(Schedulers.io())
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onComplete() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });


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
