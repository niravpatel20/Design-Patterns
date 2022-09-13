package com.designpattern.behavioral.observer.editor;

public class LogUpdateListener extends EventListener {
    @Override
    public void update(String event, String data) {
        System.out.println("Updating Log for event : " + event + " and data : " + data);
    }
}
