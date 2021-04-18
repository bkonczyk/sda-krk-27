package pl.sda.initial2.demo.rest.scope;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class FirstScopeController {

    private final RandomIdProvider idProvider;

    @GetMapping("/api/first-random-id")
    public UUID getFirstId() {
        return idProvider.getRandomId();
    }
}
