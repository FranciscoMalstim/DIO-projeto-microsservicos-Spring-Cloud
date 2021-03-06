package com.dio.cart.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;

@RedisHash("cart")
public class Cart {

    @Id
    private Long id;
    private List<Item> Items;

    public Cart(){
    }

    public Cart(Long id){
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getItems() {
        if (Items == null){
            Items = new ArrayList<>();
        }
        return Items;
    }

    public void setItems(List<Item> items) {
        Items = items;
    }
}
