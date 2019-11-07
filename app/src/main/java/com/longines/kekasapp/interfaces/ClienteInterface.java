package com.longines.kekasapp.interfaces;

public interface ClienteInterface {
    interface View extends BaseView {
        void openDialog();
    }

    interface Model {
        void openDialog();
    }

    interface Presenter {
        void openDialog();

    }
}
