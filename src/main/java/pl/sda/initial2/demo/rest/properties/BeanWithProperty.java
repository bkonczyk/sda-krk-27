package pl.sda.initial2.demo.rest.properties;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class BeanWithProperty {

    @Value("${pl.sdacademy.example}")
    private String injectedValue;
}
