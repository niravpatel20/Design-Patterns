package com.designpattern.behavioral.strategy;

import java.util.Date;
import java.util.Scanner;

public class CreditcardStrategy extends PaymentStrategy{

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditcardStrategy(){
        getPaymentDetails();
    }

    @Override
    public void getPaymentDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name");
        this.name = sc.nextLine();

        System.out.println("Enter cardNumber");
        this.cardNumber = sc.nextLine();

        System.out.println("Enter CVV");
        this.cvv = sc.nextLine();

        System.out.println("Enter Date of Expiry");
        this.dateOfExpiry = sc.nextLine();

        System.out.println("Entered details : " + this.toString());

    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + "paid via credit-card.");
    }

    @Override
    public String toString() {
        return "CreditcardStrategy{" +
                "name='" + name + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", cvv='" + cvv + '\'' +
                ", dateOfExpiry='" + dateOfExpiry + '\'' +
                '}';
    }
}
