package com.designpatterns.builder;

public class Client {

    public static void main(String[] args) {

        User user = new User.UserBuilder()
                .firstName("Nirav")
                .lastName("Patel")
                .age(24)
                .phone(992462L)
                .address("Ahmedabad").build();

        System.out.println(user);
    }
}
