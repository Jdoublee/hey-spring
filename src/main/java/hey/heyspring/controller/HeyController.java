package hey.heyspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HeyController {

    @GetMapping("hey")
    public String Hey (Model model) {
        model.addAttribute("data", "hey!!");
        return "hey";
    } 

    @GetMapping("hey-mvc")
    public String heyMvc(@RequestParam(value="name", required=false) String name, Model model) {
        model.addAttribute("name", name);
        return "hey-template";
    }
}