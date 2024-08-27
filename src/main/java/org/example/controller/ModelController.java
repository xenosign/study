package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/model")
public class ModelController {
    @GetMapping("/name/{name}")
    public String name(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "model";
    }

    @GetMapping("/thing/{thing}")
    public String test(@PathVariable("thing") String thing, Model model) {
        model.addAttribute("thing", thing);
        return "model2";
    }
}
