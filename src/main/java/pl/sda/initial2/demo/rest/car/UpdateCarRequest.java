package pl.sda.initial2.demo.rest.car;

import lombok.Value;

@Value
class UpdateCarRequest {

    Long id;
    Long distance;
}
