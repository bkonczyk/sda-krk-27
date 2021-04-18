package pl.sda.initial2.demo.rest.car;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
class CarMapper {

    static Car mapFromCreateRequest(CreateCarRequest request) {
        return new Car()
            .setModel(request.getModel())
            .setMake(request.getMake())
            .setDistance(request.getDistance())
            .setYear(request.getYear());
    }
}
