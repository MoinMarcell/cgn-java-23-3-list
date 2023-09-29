package de.neuefische;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    private List<Car> cars;

    public CarRepository() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public Car getCarByBrand(String brand){
        for(Car car : cars){
            if (car.getBrand().equals(brand)) {
                return car;
            }
        }
        return null;
    }

}
