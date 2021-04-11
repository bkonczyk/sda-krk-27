package pl.sda.initial2.demo.engine;

import org.springframework.stereotype.Service;

@Service
// dieselEngineService
public class DieselEngineService implements EngineService {

    @Override
    public void startEngine() {
        System.out.println("Klek klek");
    }
}
