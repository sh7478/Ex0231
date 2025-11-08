package com.example.ex0231.ex1;

public class Tablet implements Chargeable{
    @Override
    public void charge() {
        System.out.println("The tablet is charging");
    }

    public void sizeInInches()
    {
        System.out.println("The tablet's size in inches is 10 inches");
    }

    public void osType(){
        System.out.println("The tablet's os is android");
    }
}
