package com.longines.kekasapp.di;

import android.app.Application;

import com.longines.kekasapp.database.RealmManager;

import io.realm.Realm;

public class Injector {

    private static RealmManager realm;

    public static void setup(Application application) {
        realm = new RealmManager(application);
    }

    public static Realm providesRealm() {
        return realm.getRealm();
    }

    public static void closeProviderRealm() {
        realm.closeRealm();
    }
}
