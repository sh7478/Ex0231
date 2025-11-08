package com.example.ex0231.ex2;

public class Piano implements Playable{

    @Override
    public void play() {
        System.out.println("The piano has been played");
    }

    public void songToPlay(){
        System.out.println("The piano is playing 3rd movement of moonlight sonata");
    }

    public void size(){
        System.out.println("The piano's size is grand piano");
    }
}
