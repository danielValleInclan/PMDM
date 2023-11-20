package com.example.ejlistview;

public class Averia {
    private String titulo, modelo, url;
    private int presupuesto;

    public Averia() {
    }

    public Averia(String titulo, String modelo, String url, int presupuesto) {
        this.titulo = titulo;
        this.modelo = modelo;
        this.url = url;
        this.presupuesto = presupuesto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
}
