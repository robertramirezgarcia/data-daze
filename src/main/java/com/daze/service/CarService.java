package com.daze.service;

import com.daze.model.Car;

import java.util.Optional;

public interface CarService {

    Optional<Car> getAllCarsEmpty();

    Optional<Car> getAllCarsNotEmpty();
}