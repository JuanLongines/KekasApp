package com.longines.kekasapp.database.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.longines.kekasapp.models.Platillo;

import java.util.List;

import io.reactivex.Completable;

@Dao
public interface PlatilloDao {
    @Query("SELECT * FROM platillo")
    List<Platillo> getAll();

    @Query("SELECT * FROM platillo WHERE id IN (:platilloID)")
    List<Platillo> loadAllByIds(int[] platilloID);

//    @Query("SELECT * FROM platillo WHERE first_name LIKE :first AND " +
//            "last_name LIKE :last LIMIT 1")
//    User findByName(String first, String last);

    @Insert
    Completable insertAll(Platillo... platillo);

    @Delete
    void delete(Platillo platillo);
}
