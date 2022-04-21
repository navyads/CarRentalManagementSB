package com.examly.springapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    
    @Autowired
    private CarService cs;
    
    @RequestMapping(method = RequestMethod.GET,value = "/getCars")
    public List<Car> getAllCars()
    {
        return cs.getAllCars();
    }
    
    @RequestMapping(method = RequestMethod.POST, value="/saveCar")
    public void addCar(@RequestBody Car car)
    {
        cs.addCar(car);
    }
    
    @RequestMapping(method = RequestMethod.POST, value="/editCar/{carId}")
    public void editCar(@PathVariable String carId,@RequestBody Car car)
    {
        cs.editCar(carId, car);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value="/deleteCar/{carId}")
    public void deleteCar(@PathVariable String carId)
    {
        cs.deleteCar(carId);
    }

    @RequestMapping(method = RequestMethod.GET, value="/getCar/{carId}")
    public Car getCar(@PathVariable String carId,@RequestBody Car car)
    {
        return cs.getCarById(carId,car);
    }
}
