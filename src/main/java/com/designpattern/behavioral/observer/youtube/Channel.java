package com.designpattern.behavioral.observer.youtube;

import java.util.ArrayList;

public class Channel extends Publisher{
    private String name;

    public Channel(String name){
        this.name = name;
        subscribers = new ArrayList<>();
    }

    public void uploadVideo(String name){
        notifySubscribers("VIDEO_UPLOADED", this.name + " has uploaded a video : " + name);
    }
    @Override
    public boolean addSubscriber(Subscriber subscriber) {
        System.out.println("Hey " + this.name + ", " + subscriber.getName() + " has subscribed your channel!");
        return subscribers.add(subscriber);
    }

    @Override
    public boolean removeSubscriber(Subscriber subscriber) {
        System.out.println("Hey " + this.name + ", " + subscriber.getName() + " has unsubscribed your channel!");
        return subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String event, String message) {

        for(Subscriber subscriber: subscribers){
            subscriber.update(event, message);
        }

    }
}
