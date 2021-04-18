package pl.sda.initial2.demo.rest.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "pl.sdacademy")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertiesBasedComponent {

    private String firstProperty;
    private Integer secondProperty;
}
