package com.example.demo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass

public abstract class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Private Long id;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();

    //Getters and Setters

    public Long getId() {
        return  id;
    }
     public void setId(Long id) {
        this.id = id;
     }

     public LocalDateTime getCreatedAt() {
        return createdAt;
     }
    public void setCreatedAt ( LocalDateTime CreatedAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
     }
    public void setUpdatedAt ( LocalDateTime UpdatedAt) {
        this.updatedAt = updatedAt;
    }




}
