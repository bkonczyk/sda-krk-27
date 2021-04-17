package pl.sda.initial2.demo.rest.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@Entity(name = "cars")
@Accessors(chain = true)
public class Car {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "producer")
    private String make;
    private String model;
    private Integer year;
    private Long distance;
}
