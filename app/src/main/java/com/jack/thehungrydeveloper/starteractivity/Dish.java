package com.jack.thehungrydeveloper.starteractivity;

public class Dish {

    private String title;
    private String description;
    private double price;

    public Dish(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
