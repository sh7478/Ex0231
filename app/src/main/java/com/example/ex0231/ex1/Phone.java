package com.example.ex0231.ex1;

public class Phone implements Chargeable{

    @Override
    public void charge() {
        System.out.println("The phone is charging");
    }
}
