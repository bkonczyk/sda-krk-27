package pl.sda.initial2.demo.engine;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@RequiredArgsConstructor
public class EngineRunner {

    @Qualifier(value = "dieselEngineService")
    private final EngineService engineService;

    @PostConstruct
    public void runEngine() {
        engineService.startEngine();
    }
}
