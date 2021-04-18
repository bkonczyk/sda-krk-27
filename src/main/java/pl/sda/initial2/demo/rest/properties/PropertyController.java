package pl.sda.initial2.demo.rest.properties;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PropertyController {

    private final BeanWithProperty beanWithProperty;
    private final PropertiesBasedComponent propertiesBasedComponent;

    @GetMapping("/property")
    public String getProperty() {
        return beanWithProperty.getInjectedValue();
    }

    @GetMapping("/properties")
    public PropertiesBasedComponent getWhateverYouHave() {
        return propertiesBasedComponent;
    }
}
