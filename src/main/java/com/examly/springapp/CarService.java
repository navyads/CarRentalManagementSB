package com.examly.springapp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarService{
    @Autowired
    public CarRepository cr;
    
    public List<Car> getAllCars()
    {
        List<Car> c = new ArrayList<Car>();
        cr.findAll().forEach(c::add);
        return c;
    }
    
    public void addCar(Car car) {
        cr.save(car);
    }
    
    public void editCar(String carId, Car car) {
        cr.save(car);
    }

    public void deleteCar(String carId) {
        cr.deleteById(carId);
    }

    public Car getCarById(String carId, Car car) {
        return cr.findById(carId).get();
    }
}
