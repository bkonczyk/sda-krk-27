package pl.sda.initial2.demo.rest.scope;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class SecondScopeController {

    private final RandomIdProvider provider;

    @GetMapping("/api/second-random-id")
    public UUID whatever() {
        return provider.getRandomId();
    }
}
