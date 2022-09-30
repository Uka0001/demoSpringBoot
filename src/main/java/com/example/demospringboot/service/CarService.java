package com.example.demospringboot.service;

import com.example.demospringboot.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getAllCars();

    Car getCarById(Long id);

    Car createCar(Car car);

    void deleteCarById(Long id);
}
