package com.longines.kekasapp.core;

import android.app.Application;

import com.longines.kekasapp.di.Injector;

public class KekasApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Injector.setup(this);
    }
}
