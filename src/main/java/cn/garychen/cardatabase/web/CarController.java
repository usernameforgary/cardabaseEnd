package cn.garychen.cardatabase.web;

import cn.garychen.cardatabase.domain.Car;
import cn.garychen.cardatabase.domain.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @Autowired
    private CarRepository carRepository;

    @GetMapping("/cars")
    public Iterable<Car> getCars() {
        return carRepository.findAll();
    }
}
