package com.designpattern.behavioral.state.states;

import com.designpattern.behavioral.state.Player;

public abstract class State {

    Player player;

    State(Player player){
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();

}
