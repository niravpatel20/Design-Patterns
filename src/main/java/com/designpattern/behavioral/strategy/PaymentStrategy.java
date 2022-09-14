package com.designpattern.behavioral.strategy;

public abstract class PaymentStrategy {

    public abstract void getPaymentDetails();
    public abstract void pay(double amount);
}
