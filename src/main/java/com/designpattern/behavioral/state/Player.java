package com.designpattern.behavioral.state;

import com.designpattern.behavioral.state.states.ReadyState;
import com.designpattern.behavioral.state.states.State;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private State state;
    private Boolean playing = false;
    private List<String> playList = new ArrayList<>();
    private int currentTrack = 0;

    public Player(){
        this.state = new ReadyState(this);
        setPlaying(true);

        for(int i=1; i<=10; i++){
            playList.add("Tack " + i);
        }
    }

    public void setPlaying(boolean b) {
        playing = true;
    }

    public boolean isPlaying(){
        return playing;
    }

    public void changeState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    public String startPlayback(){
        return "Playing " + playList.get(currentTrack);
    }

    public String nextTrack(){
        currentTrack++;
        if(currentTrack == playList.size()){
            currentTrack = 0;
        }
        return "Playing " + playList.get(currentTrack);
    }

    public String previousTrack(){
        currentTrack--;
        if(currentTrack < 0){
            currentTrack = playList.size() - 1;
        }

        return "Playing " + playList.get(currentTrack);
    }

    public void setCurrentTrackAfterStop(){
        currentTrack = 0;
    }
}
