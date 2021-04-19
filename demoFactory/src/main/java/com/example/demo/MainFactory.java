package com.example.demo;

import com.example.demo.factory.CarFactory;
import com.example.demo.objects.BMV;
import com.example.demo.objects.Car;

import java.util.List;

public class MainFactory {


    public static void main(String[] args) {

        BMV bmv = (BMV) CarFactory.getCar("BMW");
        System.out.println(bmv.carType());
        bmv.drive();


        System.out.println("--------------------------");
        List<Car> list = CarFactory.getlist();

        for (Car car : list) {
            System.out.println(car.carType());
        }

    }

}
