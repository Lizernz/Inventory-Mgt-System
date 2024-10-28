package com.example.demo.entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import java.time.LocalDateTime;

@MappedSuperclass

public abstract class MainEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();

    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
    
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
        this.createdAt = CreatedAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
     }
    public void setUpdatedAt ( LocalDateTime UpdatedAt) {
        this.updatedAt = UpdatedAt;
    }

}
