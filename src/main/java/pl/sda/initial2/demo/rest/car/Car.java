package pl.sda.initial2.demo.rest.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
public class Car {

    private Long id;
    private String make;
    private String model;
    private Integer year;
    private Long distance;
}
