package com.designpattern.behavioral.observer.editor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... events){
        for(String event : events){
            listeners.put(event, new ArrayList<>());
        }
    }

    public boolean subsribe(String event, EventListener eventListener){
        return listeners.get(event).add(eventListener);
    }

    public boolean unsubscribe(String event, EventListener eventListener){
        return listeners.get(event).remove(eventListener);
    }

    public void notify(String event, String data){
        for(EventListener listener : listeners.get(event)){
            listener.update(event, data);
        }
    }

}
