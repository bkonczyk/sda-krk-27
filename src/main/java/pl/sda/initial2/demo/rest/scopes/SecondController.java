package pl.sda.initial2.demo.rest.scopes;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SecondController {
  private final RandomNumberProvider randomNumberProvider;

  @GetMapping("/api/number/val-b")
  public Integer fetchSecondNumber() {
    return randomNumberProvider.getValue();
  }
}
