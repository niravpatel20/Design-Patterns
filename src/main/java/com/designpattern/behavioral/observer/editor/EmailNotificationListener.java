package com.designpattern.behavioral.observer.editor;

public class EmailNotificationListener extends EventListener {

    @Override
    public void update(String event, String data) {
        System.out.println("Sending email for event : " + event + " and data : " + data);
    }
}
