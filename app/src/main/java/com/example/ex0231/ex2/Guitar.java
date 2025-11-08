package com.example.ex0231.ex2;

public class Guitar implements Playable{

    @Override
    public void play() {
        System.out.println("the guitar has been played");
    }

    public void chord(){
        System.out.println("The guitar's chord that has been played is Em");
    }

    public void type(){
        System.out.println("The guitar's type is electric");
    }
}
