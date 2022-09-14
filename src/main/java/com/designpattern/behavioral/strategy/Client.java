package com.designpattern.behavioral.strategy;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws Exception {

        Item item1 = new Item("item1", "123", 45.0);
        Item item2 = new Item("item2", "345", 90.0);
        Item item3 = new Item("item3", "890", 25.0);

        ShoppingCart cart = new ShoppingCart();

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        Scanner sc = new Scanner(System.in);

        Double amountToPay = cart.getTotalAmount();

        System.out.println("Total Bill : " + amountToPay);
        System.out.println("Please select payment option : \n1. Paypal\n2. Creditcard");

        int paymentSelectionInput = sc.nextInt();

        PaymentStrategy paymentStrategy = StrategyFactory.getPaymentStrategy(paymentSelectionInput);

        paymentStrategy.pay(amountToPay);


    }
}
