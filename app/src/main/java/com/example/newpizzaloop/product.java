package com.example.newpizzaloop;

public class product {
    private int id;
    private String titlt, shortdesc;
    private double price;
    private int image;
    private double rating;

    public product(int id, String titlt, String shortdesc, double price, int image, double rating) {
        this.id = id;
        this.titlt = titlt;
        this.shortdesc = shortdesc;
        this.price = price;

        this.image = image;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getTitlt() {
        return titlt;
    }
    public  double getRating(){
        return rating;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public double getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }
}
