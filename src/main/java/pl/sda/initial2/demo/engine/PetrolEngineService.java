package pl.sda.initial2.demo.engine;

public class PetrolEngineService implements EngineService {

    @Override
    public void startEngine() {
        System.out.println("Brum brum");
    }
}
