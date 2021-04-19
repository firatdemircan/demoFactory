package com.example.demo.objects;

public class BMV extends Car{
    @Override
    public String drive() {

        System.out.println("I am driving a BMW");
        return null;
    }

    @Override
    public String carType() {
        return "BMW 116d";
    }

}
