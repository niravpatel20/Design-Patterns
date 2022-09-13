package com.designpattern.behavioral.observer.youtube;

public class User extends Subscriber{

    public User(String name){
        this.name = name;
    }
    @Override
    public void update(String event, String message) {
        System.out.println("Hey " + this.name + " Event: " + event + " Message: " + message);
    }

    @Override
    public boolean subscribe(Publisher publisher) {
        return publisher.addSubscriber(this);
    }

    @Override
    public boolean unsubscribe(Publisher publisher) {
        return publisher.removeSubscriber(this);
    }

}
