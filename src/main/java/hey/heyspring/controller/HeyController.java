package hey.heyspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HeyController {

    @GetMapping("hey")
    public String Hey (Model model) {
        model.addAttribute("data", "hey!!");
        return "hey";
    } 
}