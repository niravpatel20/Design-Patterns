package com.designpattern.behavioral.strategy;

import java.util.Scanner;

public class PaypalStrategy extends PaymentStrategy {

    String email;
    String password;

    public PaypalStrategy(){
        getPaymentDetails();
    }
    @Override
    public void getPaymentDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter email");
        this.email = sc.nextLine();

        System.out.println("Enter password");
        this.password = sc.nextLine();

        System.out.println("Entered details : " + this.toString());

    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid via Paypal.");
    }

    @Override
    public String toString() {
        return "PaypalStrategy{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
