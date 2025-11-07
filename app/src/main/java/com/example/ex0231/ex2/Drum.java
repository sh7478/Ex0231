package com.example.ex0231.ex2;

public class Drum implements Playable{

    @Override
    public void play() {
        System.out.println("The drum has been played");
    }

    public void isFootPedal(){
        System.out.println("there is a foot pedal in the drums");
    }
}
