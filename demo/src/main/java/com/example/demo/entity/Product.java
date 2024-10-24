package com.example.demo.entity;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity
public class Product extends Item{
    @NotEmpty(message = "product name cannot be empty")
    private String name;
    private double price;
    private int quantity;

    //Getters and Setters

    public String getName() {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
