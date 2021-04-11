package pl.sda.initial2.demo.rest.car;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Repository
class CarRepository {

    private List<Car> carsList = new ArrayList<>();

    void addCar(CreateCarRequest request) {
        Long maxId = carsList.stream()
            .map(Car::getId)
            .max(Comparator.comparing(Long::intValue))
            .orElse(0L);

        long distance = request.getDistance() != null ? request.getDistance() : 0L;

        carsList.add(
            Car.of(
                maxId + 1L,
                request.getMake(),
                request.getModel(),
                request.getYear(),
                distance));
    }

    void addCars(List<Car> cars) {
        carsList.addAll(cars);
    }

    List<Car> getAllCars() {
        return carsList;
    }

    Car getCar(Long id) {
        return carsList.stream()
            .filter(car -> car.getId().equals(id))
            .findAny()
            .orElse(null);
    }

    void updateCar(UpdateCarRequest request) {
        carsList.stream()
            .filter(car -> car.getId().equals(request.getId()))
            .forEach(car -> car.setDistance(request.getDistance()));
    }

    void deleteCar(Long id) {
        Car car = getCar(id);
        carsList.remove(car);
    }
}
