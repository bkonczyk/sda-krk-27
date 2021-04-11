package pl.sda.initial2.demo.rest.car;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
class CarDataInit {

    private final CarRepository carRepository;

    @PostConstruct
    void addCars() {
        List<Car> carsList = createCarsList();
        carRepository.addCars(carsList);
    }

    private List<Car> createCarsList() {
        List<Car> cars = new ArrayList<>();
        cars.add(Car.of(1L, "Renault", "Clio", 1998, 10000L));
        cars.add(Car.of(2L, "Hyundai", "Accent", 1995, 10000L));
        cars.add(Car.of(3L, "Lada", "Samara", 1977, 10000L));
        return cars;
    }
}
