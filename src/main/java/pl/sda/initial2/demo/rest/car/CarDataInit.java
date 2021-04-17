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
        carRepository.saveAll(carsList);
    }

    private List<Car> createCarsList() {
        List<Car> cars = new ArrayList<>();
        cars.add(Car.of(null, "Renault", "Clio", 1998, 10000L));
        cars.add(Car.of(null, "Hyundai", "Accent", 1995, 10000L));
        cars.add(Car.of(null, "Lada", "Samara", 1977, 10000L));
        return cars;
    }
}
