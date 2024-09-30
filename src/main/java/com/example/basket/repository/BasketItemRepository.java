package com.example.basket.repository;

import com.example.basket.entity.Basket;
import com.example.basket.entity.BasketItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BasketItemRepository extends JpaRepository<BasketItems,Long> {

    Optional<BasketItems> findByBasketAndProduct(Basket basket, String product);

    @Query(nativeQuery = true ,value = "SELECT SUM(quantity) from basket_items where basket = ?1")
    Long sumBasketItems(long basket);

    Optional<BasketItems> findBasketItemsByUid(String uid);

    List<BasketItems> findBasketItemsByBasket(Basket basket);

}

