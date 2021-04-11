package pl.sda.initial2.demo.rest.car;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cars")
public class CarController {

    // tu wstrzyknac service
    private final CarRepository repository;

    @GetMapping
    public List<Car> getCars() {
        return repository.getAllCars();
    }

    @GetMapping(value = "/{id}")
    public Car getCar(@PathVariable Long id) {
        return repository.getCar(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addCar(@RequestBody CreateCarRequest request) {
        repository.addCar(request);
    }

    @PutMapping
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void updateCar(@RequestBody UpdateCarRequest request) {
        repository.updateCar(request);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteCar(@PathVariable Long id) {
        repository.deleteCar(id);
    }
}
