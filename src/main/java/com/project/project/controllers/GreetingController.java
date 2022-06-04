package com.project.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class GreetingController {

    @GetMapping("/")
    public String greeting( Model model) {
        model.addAttribute("title", "Главная страница");
        return "greeting";
    }
    @GetMapping("/about")
    public String about( Model model) {
        model.addAttribute("title", "О нас");
        return "about";
    }

}