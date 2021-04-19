package com.example.demo.objects;

public class Audi extends Car {


    @Override
    public String drive() {
        System.out.println("I am driving a Audi");
        return null;
    }

    @Override
    public String carType() {
        return "Audi A5";
    }
}
