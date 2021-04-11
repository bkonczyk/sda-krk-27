package pl.sda.initial2.demo.injection;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class ExampleService {

    public void log() {
        log.info("niewazne");
    }
}
