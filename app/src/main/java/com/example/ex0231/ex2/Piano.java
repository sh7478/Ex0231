package com.example.ex0231.ex2;

public class Piano implements Playable{

    @Override
    public void play() {
        System.out.println("the piano has been played");
    }

    public void songToPlay(){
        System.out.println("the piano is playing 3rd movement of moonlight sonata");
    }
}
