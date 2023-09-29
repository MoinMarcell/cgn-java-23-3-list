package de.neuefische;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
int = Integer
double = Double
float = Float
char = Character
boolean = Boolean
 */

public class Main {
    public static void main(String[] args) {
        /*List<String> names = new ArrayList<>();
        List<String> names2 = new LinkedList<>();
        String[] names3 = new String[3];*/

        //names3[0] = "Name";
        //System.out.println(names3[0]);

        //System.out.println(names.size());

        /*for(int i = 0; i <= 10; i++){
            names.add(i, ("name" + i));
        }

        for(String s : names){
            System.out.println(s);
        }*/

        //System.out.println(names.get(0));

        CarRepository carRepository = new CarRepository();
        Car bmw = new Car("BMW", "Schwarz");
        carRepository.addCar(bmw);

        System.out.println(carRepository.getCarByBrand("BMW"));
        System.out.println(carRepository.getCarByBrand("VW"));
    }
}