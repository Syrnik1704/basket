package com.example.basket.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ListBasketItemDTO {
    private List<BasketItemDTO> basketProducts;
    private double summaryPrice;
}
