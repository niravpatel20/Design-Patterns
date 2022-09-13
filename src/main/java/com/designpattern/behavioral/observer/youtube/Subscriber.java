package com.designpattern.behavioral.observer.youtube;

public abstract class Subscriber {

    protected String name;
    public abstract void update(String event, String message);

    public abstract boolean subscribe(Publisher channel);

    public abstract boolean unsubscribe(Publisher channel);

    public String getName(){
        return this.name;
    }

}
