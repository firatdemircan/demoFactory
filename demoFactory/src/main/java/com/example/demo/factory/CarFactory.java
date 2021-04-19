package com.example.demo.factory;

import com.example.demo.objects.Audi;
import com.example.demo.objects.BMV;
import com.example.demo.objects.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarFactory {

    //use getCar method to get object of type car
    public static Car getCar(String carType){
        if(carType == null){
            return null;
        }
        if(carType.equalsIgnoreCase("BMW")){
            return new BMV();

        } else if(carType.equalsIgnoreCase("AUDI")){
            return new Audi();

        }
        return null;
    }

    public static List<Car> getlist(){

        List<Car> list = new ArrayList<Car>();


        for (int i = 0; i < 10; i++) {
            Random rd = new Random();
            if(rd.nextInt()*100 <50){
                BMV bmw = (BMV) getCar("BMW");
                list.add(bmw);
            }
            else{
                Audi audi = (Audi) getCar("AUDI");
                list.add(audi);
            }
        }
        return list;
    }

}
