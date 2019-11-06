package com.longines.kekasapp.presenters;

import com.longines.kekasapp.activities.LoginActivity;
import com.longines.kekasapp.interactors.LoginModel;
import com.longines.kekasapp.interfaces.LoginIterface;

public class LoginPresenter implements LoginIterface.Presenter {

    private LoginIterface.Model model;
    private LoginIterface.View view;

    public LoginPresenter(LoginActivity view) {
        this.view = view;
        this.model = new LoginModel(this);
    }

    @Override
    public void doLogin(String user, String pwd) {
        if (view != null) {
            model.doLogin(user, pwd);
        }
    }

    @Override
    public void showError(String error) {
        if (view != null) {
            view.showError(error);
        }
    }
}
