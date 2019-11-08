package com.longines.kekasapp.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.longines.kekasapp.database.daos.PlatilloDao;
import com.longines.kekasapp.models.Platillo;

@Database(entities = {Platillo.class}, version = 1, exportSchema = false)
public abstract class KekasDatabase extends RoomDatabase {
    private static KekasDatabase instance;

    public synchronized static KekasDatabase getInstance(final Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context, KekasDatabase.class, "kekas_local.db")
//                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }

    public abstract PlatilloDao getPlatilloDao();
}
