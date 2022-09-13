package com.designpattern.behavioral.observer.youtube;

public class Client {

    public static void main(String[] args) {

        Channel telusko = new Channel("Telusko");
        Channel mkbhd = new Channel("mkbhd");

        User rom = new User("rom");
        User raj = new User("raj");
        rom.subscribe(telusko);
        raj.subscribe(telusko);
        telusko.uploadVideo("Hello Java");

        User kush = new User("kush");
        User dhruvin = new User("dhruvin");
        kush.subscribe(mkbhd);
        dhruvin.subscribe(mkbhd);
        mkbhd.uploadVideo("New IPhone 14");

        raj.unsubscribe(telusko);
        telusko.uploadVideo("JAVA 8");

    }
}
