package org.example.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j
@RequestMapping("/home")
public class HomeController {
    // /home
    @GetMapping("")
    public String home() {
        return "home";
    }

    // /home/2
    @GetMapping("/2")
    public String home2() {
        return "home2";
    }

}
