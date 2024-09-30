package com.example.basket.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BasketItemAddDTO {
    private String product;
    private long quantity;
}

