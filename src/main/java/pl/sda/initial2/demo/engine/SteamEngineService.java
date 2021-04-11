package pl.sda.initial2.demo.engine;

public class SteamEngineService implements EngineService {

    @Override
    public void startEngine() {
        System.out.println("Dzwiek silnika parowego");
    }
}
