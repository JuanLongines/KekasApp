package com.longines.kekasapp.models;

import io.realm.RealmObject;

public class Platillo extends RealmObject {
    int id;
    String nombre_platillo;
    String precio;
    int id_status;

    public Platillo() {
    }

    public Platillo(int id, String nombre_platillo, String precio, int id_status) {
        this.id = id;
        this.nombre_platillo = nombre_platillo;
        this.precio = precio;
        this.id_status = id_status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_platillo() {
        return nombre_platillo;
    }

    public void setNombre_platillo(String nombre_platillo) {
        this.nombre_platillo = nombre_platillo;
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
