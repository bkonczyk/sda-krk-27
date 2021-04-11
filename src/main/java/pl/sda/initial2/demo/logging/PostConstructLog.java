package pl.sda.initial2.demo.logging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class PostConstructLog {

    @PostConstruct
    public void log() {
        log.info("Moj drugi komponent");

    }
}
