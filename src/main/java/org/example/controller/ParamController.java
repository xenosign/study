package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/param")
public class ParamController {
    @GetMapping("")
    public String param(
            @RequestParam("name") String name,
            @RequestParam("age") String age,
            Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "param";
    }

    @GetMapping("/test")
    public String test(
            @RequestParam String name,
            @RequestParam String age,
            @RequestParam String old,
            Model model
    ) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("old", old);
        return "param2";
    }



}
