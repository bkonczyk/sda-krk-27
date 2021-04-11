package pl.sda.initial2.demo.engine;

import org.springframework.stereotype.Service;

@Service
// petrolEngineService
public class PetrolEngineService implements EngineService {

    @Override
    public void startEngine() {
        System.out.println("Brum brum");
    }
}
