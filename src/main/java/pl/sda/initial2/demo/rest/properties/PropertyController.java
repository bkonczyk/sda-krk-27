package pl.sda.initial2.demo.rest.properties;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PropertyController {

    private final BeanWithProperty beanWithProperty;

    @GetMapping("/api/property")
    public String getProperty() {
        return beanWithProperty.getInjectedValue();
    }
}
