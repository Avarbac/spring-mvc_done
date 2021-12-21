package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    public List<Car> createCars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", 1, "Germany"));
        carList.add(new Car("Mercedes", 2, "Germany"));
        carList.add(new Car("Audi", 3, "Germany"));
        carList.add(new Car("Toyota", 4, "Japan"));
        carList.add(new Car("Chevrolet", 5, "USA"));

        return carList;
    }

    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(value = "count", defaultValue = "5") int count,
                           Model model) {

        List<Car> carList = createCars();

        CarService carService = new CarService();

        List<Car> finalCarList = carService.countCars(carList, count);

        model.addAttribute("cars", finalCarList);

        return "cars";
    }
}
