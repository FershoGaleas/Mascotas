package com.example.mascotas;

import android.widget.ImageView;

import java.io.Serializable;

public class Perros implements Serializable {
    String nombre;


    public Perros(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}
