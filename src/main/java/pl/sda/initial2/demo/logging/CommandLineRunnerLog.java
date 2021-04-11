package pl.sda.initial2.demo.logging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CommandLineRunnerLog implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        // tutaj chcemy cos zalogowac po inicjalizacji aplikacji
        log.info("Moj pierwszy komponent");
    }
}
