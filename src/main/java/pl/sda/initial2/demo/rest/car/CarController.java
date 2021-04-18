package pl.sda.initial2.demo.rest.car;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

//    @PostMapping
//    @ResponseStatus(code = HttpStatus.CREATED)
//    public Car addCar(@RequestBody CreateCarRequest request) {
//        return service.addCar(request);
//    }

    @PostMapping
    public ResponseEntity<Car> addCar(@RequestBody CreateCarRequest request) {
        Car car = service.addCar(request);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Some Header", "Some Header Value");

        return ResponseEntity
            .status(HttpStatus.CREATED)
            .headers(httpHeaders)
            .contentType(MediaType.APPLICATION_JSON)
            .body(car);
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
