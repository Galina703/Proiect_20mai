package pixel.academy.spring._core_ioc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Chef myChef;

    //constructor
    @Autowired

    public DemoController(Chef theChef) {
        myChef=theChef;
    }
}
