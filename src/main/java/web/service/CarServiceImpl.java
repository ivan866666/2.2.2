package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Porshe 911","Metalic", 60));
        cars.add(new Car("Lada","Rad", 20));
        cars.add(new Car("Brabus","Black", 5));
        cars.add(new Car("Infinity","Yellow", 7));
        cars.add(new Car("Mazda","White", 2));
    }

    @Override
    public List<Car> limit(int a) {
        return cars.stream().limit(a).collect(Collectors.toList());
    }
}