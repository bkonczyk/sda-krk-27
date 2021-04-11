package pl.sda.initial2.demo.injection;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@RequiredArgsConstructor
public class WrapperService {

    private final ExampleService exampleService;

    @PostConstruct
    public void businessLogic() {
        exampleService.log();
    }
}
