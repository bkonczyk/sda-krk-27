package pl.sda.initial2.demo.rest.car;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car getCar(Long id) {
        return carRepository.findById(id).get();
    }

    public Car addCar(CreateCarRequest request) {
        Car car = CarMapper.mapFromCreateRequest(request);
        return carRepository.save(car);
    }

    @Transactional
    public void updateCar(Long id, UpdateCarRequest request) {
        Optional<Car> carOptional = carRepository.findById(id);
        Car car = carOptional.orElseThrow(() -> new NoSuchElementException("Car not found"));
        car.setDistance(request.getDistance());
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
