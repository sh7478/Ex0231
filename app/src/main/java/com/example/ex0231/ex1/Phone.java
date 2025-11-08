package com.example.ex0231.ex1;

public class Phone implements Chargeable{

    @Override
    public void charge() {
        System.out.println("The phone is charging");
    }

    public void Brand(){
        System.out.println("The phone's brand is apple");
    }

    public void maxZoom(){
        System.out.println("The phone's camera max zoom is 64x");
    }
}
