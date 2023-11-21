package com.example.examen3;

import java.io.Serializable;

public class Producto implements Serializable {
    private String titulo;
    private int precio;

    public Producto(String nombre, int precio) {
        this.titulo = nombre;
        this.precio = precio;
    }

    public Producto(){}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
