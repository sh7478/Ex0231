package com.example.ex0231.ex1;

public class Laptop implements Chargeable{
    @Override
    public void charge() {
        System.out.println("The laptop is charging");
    }

    public void batteryLife()
    {
        System.out.println("The laptop will have battery for 7 hours");
    }
}
