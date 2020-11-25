package com.mesut.springWeb.MVCcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVC_Controller {
    @GetMapping("/")
    public String getHomePage(Model model){
        model.addAttribute("theDate", new java.util.Date());
        return "homePage";
    }
}
