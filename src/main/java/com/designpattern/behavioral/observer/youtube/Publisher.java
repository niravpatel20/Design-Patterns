package com.designpattern.behavioral.observer.youtube;

import java.util.List;

public abstract class Publisher {

    List<Subscriber> subscribers;

    public abstract boolean addSubscriber(Subscriber subscriber);

    public abstract boolean removeSubscriber(Subscriber subscriber);

    public abstract void notifySubscribers(String event, String message);
}
