package pl.sda.initial2.demo.rest.scopes;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FirstController {

  private final RandomNumberProvider randomNumberProvider;

  @GetMapping("/api/number/val-a")
  public Integer showFirstNumber() {
    return randomNumberProvider.getValue();
  }
}
