package com.longines.kekasapp.database;

import android.content.Context;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class RealmManager {

    private RealmConfiguration config;
    private Realm realm;

    public RealmManager(Context application) {
        Realm.init(application);
        config = new RealmConfiguration.Builder().name("myrealm.realm").build();
        Realm.setDefaultConfiguration(config);
    }

    public Realm getRealm() {
        realm = Realm.getInstance(config);

        return realm;
    }

    public void closeRealm() {
        realm.close();
    }
}
