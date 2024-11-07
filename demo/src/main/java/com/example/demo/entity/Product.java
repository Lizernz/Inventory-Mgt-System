package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product extends MainEntity{
    @NotEmpty(message = "product name cannot be empty")
    private String name;
    private double price;
    private int quantity;

}
