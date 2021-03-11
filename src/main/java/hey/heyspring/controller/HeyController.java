package hey.heyspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


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

    @GetMapping("hey-string")
    @ResponseBody
    public String heyString(@RequestParam("name") String name) {
        return "hey " + name;
    }

    @GetMapping("hey-api")
    @ResponseBody
    public Hey heyApi(@RequestParam("name") String name) {
        Hey hey = new Hey();
        hey.setName(name);
        return hey;
    }

    static class Hey {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}