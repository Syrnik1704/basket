package com.example.basket.entity;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Product{
    private long id;
    private String uid;
    private boolean active;
    private String name;
    private String mainDescription;
    private String htmlDescription;
    private float price;
    private String[] imageUrls;
    private String parameters;
    private LocalDate createdAt;
    private Category category;
}

