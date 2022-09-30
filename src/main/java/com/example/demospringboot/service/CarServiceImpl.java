package com.example.demospringboot.service;

import com.example.demospringboot.model.Car;
import com.example.demospringboot.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getCarById(Long id) {
        return null;
    }

    @Override
    public Car createCar(Car car) {
        return carRepository.save(car);
    }


    @Override
    public void deleteCarById(Long id) {

    }
}
