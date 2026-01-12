package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("Toyota", "Carina", 2020));
        cars.add(new Car("BMW", "X6", 2021));
        cars.add(new Car("Audi", "A4", 2019));
        cars.add(new Car("Mercedes", "C-Class", 2022));
        cars.add(new Car("Honda", "Civic", 2018));
    }

    public List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
