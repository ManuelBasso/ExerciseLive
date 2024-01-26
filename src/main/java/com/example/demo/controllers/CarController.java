package com.example.demo.controllers;

import com.example.demo.entities.Car;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v2/cars")
public class CarController {

    List<Car> listCars = new ArrayList<>();


    @GetMapping(path = "/all")
    public List<Car> getAll() {

        return listCars;
    }

    @PostMapping(path = "/addCar")
    public void addCarToList(@RequestBody Car carToAdd) {
        listCars.add(carToAdd);
    }

    @PostMapping(path = "/addList")
    public void addList(@RequestBody List<Car> listToAdd){
        listCars.addAll(listToAdd);
    }

    @GetMapping(path = "/filterbymarca")
    public List<Car> filterByMarca(@RequestParam String marcaToFilter) {

        return listCars.stream().filter(car -> car.getMarca().equalsIgnoreCase(marcaToFilter)).collect(Collectors.toList());
    }

    @GetMapping(path = "/filterbyid/{idToFilter}")
    public Car filterById(@PathVariable String idToFilter) {

        for (Car a : listCars) {
            if (a.getId().equals(UUID.fromString(idToFilter))) {
                return a;
            }
        }
        return null;
    }


}
