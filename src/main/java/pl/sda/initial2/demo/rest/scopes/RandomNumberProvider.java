package pl.sda.initial2.demo.rest.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Scope("prototype")
public class RandomNumberProvider {
  private final int value = new Random().nextInt();

  public int getValue() {
    return value;
  }
}
