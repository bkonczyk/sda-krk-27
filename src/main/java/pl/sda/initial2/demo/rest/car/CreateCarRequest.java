package pl.sda.initial2.demo.rest.car;

import lombok.Value;

@Value
class CreateCarRequest {

    String make;
    String model;
    Integer year;
    Long distance;
}
