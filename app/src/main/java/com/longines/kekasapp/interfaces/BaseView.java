package com.longines.kekasapp.interfaces;

import android.content.Context;

public interface BaseView {

    Context getContext();

    void showError(String message);

    void startLoading();

    void stopLoading();
}
