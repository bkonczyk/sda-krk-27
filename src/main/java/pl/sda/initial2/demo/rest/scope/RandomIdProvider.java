package pl.sda.initial2.demo.rest.scope;

import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.UUID;

@Component
@RequestScope
@Getter
public class RandomIdProvider {

    private final UUID randomId = UUID.randomUUID();
}
