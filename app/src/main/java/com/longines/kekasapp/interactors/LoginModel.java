package com.longines.kekasapp.interactors;

import com.longines.kekasapp.interfaces.LoginIterface;
import com.longines.kekasapp.presenters.LoginPresenter;

public class LoginModel implements LoginIterface.Model {

    private LoginIterface.Presenter presenter;

    public LoginModel(LoginPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void doLogin(String user, String pwd) {
        if (user.isEmpty()) {
            presenter.showError("Usuario Vacio");
            return;
        } else if (pwd.isEmpty()) {
            presenter.showError("PWD vacio");
            return;
        }
    }
}

