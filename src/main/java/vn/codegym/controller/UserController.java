package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/hello")
    public String helloCodeGym(ModelMap model){
        model.addAttribute("user","Hello CodeGym");
        return "hello";
    }
}
