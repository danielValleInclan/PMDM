package com.example.examen2;

import android.widget.ImageView;

public class Product {
    private String name;
    private int price;
    private int image;

    public Product(int image, String name, int price) {
        this.image = image;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
