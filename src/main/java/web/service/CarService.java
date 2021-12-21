package web.service;

import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    public List<Car> countCars(List<Car> carList, int number) {

        List<Car> finalCarList = carList.stream()
        .limit(number)
        .collect(Collectors.toList());

        return finalCarList;
    }
}
