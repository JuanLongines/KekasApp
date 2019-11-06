package com.longines.kekasapp.interfaces;

public interface LoginIterface {

    interface View extends BaseView {
        void doLogin();
    }

    interface Model {
        void doLogin(String user, String pwd);
    }

    interface Presenter {
        void doLogin(String user, String pwd);

        void showError(String error);
    }

}
