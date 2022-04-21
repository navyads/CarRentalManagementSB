package com.examly.springapp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car_management")
public class Car {
    @Id
    private String carId;
    private String carModel;
    private String carNo;
    private String status;
    
    public Car() {
    }
    
    public Car(String carId, String carModel, String carNo, String
    status) {
        this.carId = carId;
        this.carModel = carModel;
        this.carNo = carNo;
        this.status = status;
    }
    
    public String getCarId() {
        return carId;
    }
    
    public String getCarModel() {
        return carModel;
    }
    
    public String getCarNo() {
        return carNo;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setCarId(String carId) {
        this.carId = carId;
    }
    
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
    
    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}

