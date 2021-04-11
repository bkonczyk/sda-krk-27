package pl.sda.initial2.demo.engine;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@RequiredArgsConstructor
public class EngineRunner {

    private final EngineService kaszlok;

    @PostConstruct
    public void runEngine() {
        kaszlok.startEngine();
    }
}
