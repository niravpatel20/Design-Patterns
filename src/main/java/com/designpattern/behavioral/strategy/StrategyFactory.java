package com.designpattern.behavioral.strategy;

public class StrategyFactory {

    public static PaymentStrategy getPaymentStrategy(int paymentSelectionInput) throws Exception {

        return switch (paymentSelectionInput){
          case 1 -> new PaypalStrategy();
          case 2 -> new CreditcardStrategy();
          default -> throw new Exception("Please select valid Payment option");
        };
    }
}
