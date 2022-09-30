package com.example.demospringboot.controller;

import com.example.demospringboot.model.Car;
import com.example.demospringboot.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/all")
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }

    @PostMapping("/create")
    public Car createCar(@RequestBody Car car){
        return carService.createCar(car);
    }

    @DeleteMapping("/delete")
    public void deleteCarById();
}
