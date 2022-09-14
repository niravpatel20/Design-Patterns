package com.designpattern.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> items = new ArrayList<>();

    public boolean addItem(Item item){
        return items.add(item);
    }

    public boolean removeItem(Item item){
        return items.remove(item);
    }

    public Double getTotalAmount(){

        Double amount = 0.0;

        for(Item item: items){
            amount += item.getPrice();
        }

        return amount;
    }
}
