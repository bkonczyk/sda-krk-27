package pl.sda.initial2.demo.rest.car;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cars")
public class CarController {

    private final CarService service;

    @GetMapping
    public List<Car> getCars() {
        return service.getAllCars();
    }

    @GetMapping(value = "/{id}")
    public Car getCar(@PathVariable Long id) {
        return service.getCar(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addCar(@RequestBody CreateCarRequest request) {
        service.addCar(request);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void updateCar(@PathVariable Long id, @RequestBody UpdateCarRequest request) {
        service.updateCar(id, request);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteCar(@PathVariable Long id) {
        service.deleteCar(id);
    }
}
