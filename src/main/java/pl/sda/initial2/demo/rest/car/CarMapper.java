package pl.sda.initial2.demo.rest.car;

class CarMapper {

    static Car mapFromCreateRequest(CreateCarRequest request) {
        return new Car()
            .setModel(request.getModel())
            .setMake(request.getMake())
            .setDistance(request.getDistance())
            .setYear(request.getYear());
    }
}
