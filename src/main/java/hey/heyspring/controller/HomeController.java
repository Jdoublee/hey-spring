package hey.heyspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") // index.html보다 우선
    public String home() {
        return "home";
    }

    


}
