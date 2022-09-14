package com.designpattern.behavioral.strategy;

public class Item {

    private String name;
    private String barcode;
    private Double price;

    public Item(String name, String barcode, Double price) {
        this.name = name;
        this.barcode = barcode;
        this.price = price;
    }

    public Double getPrice(){
        return price;
    }

}
