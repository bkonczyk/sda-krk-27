package pl.sda.initial2.demo.engine;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EngineConfiguration {

    @Bean
    public EngineService steamEngineService() {
        return new SteamEngineService();
    }

    @Bean
    public EngineService waterEngineService() {
        return new WaterEngineService();
    }
}
