package web.Servise;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsServise {

    private List<Car> carsList;

    {
        carsList = new ArrayList<>();
        carsList.add(new Car("Maz", 1980, 233));
        carsList.add(new Car("Gaz", 2000, 345));
        carsList.add(new Car("Niva", 1990, 680));
        carsList.add(new Car("Kamaz", 1992, 589));
        carsList.add(new Car("Lada", 1995, 600));
    }

    public List<Car> getAllCars() {
        return carsList;
    }

    public List<Car> getCarsNumber(int count) {
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}

