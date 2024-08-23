package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/model")
public class ModelController {
    @GetMapping("/{name}")
    public String model(@PathVariable("name") String name, Model model) {
        model.addAttribute("sendName", name);
        return "model";
    }
}
