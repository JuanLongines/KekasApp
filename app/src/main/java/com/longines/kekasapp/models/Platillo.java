package com.longines.kekasapp.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Platillo {
    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo(name = "nombre_platillo")
    String nombre;
    @ColumnInfo(name = "precio_platillo")
    String precio;
    @ColumnInfo(name = "estado_platillo")
    int id_status;

    public Platillo() {
    }

//    public Platillo(int id, String nombre, String precio, int id_status) {
//        this.id = id;
//        this.nombre = nombre;
//        this.precio = precio;
//        this.id_status = id_status;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getId_status() {
        return id_status;
    }

    public void setId_status(int id_status) {
        this.id_status = id_status;
    }
}
