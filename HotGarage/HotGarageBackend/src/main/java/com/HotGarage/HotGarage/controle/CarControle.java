package com.HotGarage.HotGarage.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HotGarage.HotGarage.car.CarJPA;
import com.HotGarage.HotGarage.car.CarRepository;

@RestController
@RequestMapping("car")
public class CarControle {

    @Autowired
    private CarRepository carRepository;

    @GetMapping("/id={id}")
    public CarJPA getCar(@PathVariable long id) {
        return carRepository.getReferenceById(id);
    }
}
