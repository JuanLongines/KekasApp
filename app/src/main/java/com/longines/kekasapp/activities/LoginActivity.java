package com.longines.kekasapp.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.longines.kekasapp.R;
import com.longines.kekasapp.interfaces.LoginIterface;
import com.longines.kekasapp.presenters.LoginPresenter;
import com.rengwuxian.materialedittext.MaterialEditText;

public class LoginActivity extends BaseActivity implements LoginIterface.View, View.OnClickListener {

    LoginPresenter presenter;
    private MaterialEditText edtUser;
    private MaterialEditText edtPwd;
    private Button btnIngreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindUI();
        presenter = new LoginPresenter(this);

    }

    private void bindUI() {
        edtUser = findViewById(R.id.edtUser);
        edtPwd = findViewById(R.id.edtPwd);
        btnIngreso = findViewById(R.id.btnIngreso);
        btnIngreso.setOnClickListener(this);
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
    public void onClick(View item) {
        switch (item.getId()) {
            case R.id.btnIngreso:
                doLogin();
                break;
        }
    }
}
