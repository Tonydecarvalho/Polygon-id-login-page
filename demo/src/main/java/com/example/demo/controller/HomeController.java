package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("public")
    public String publicPage() {
        return "public";
    }

    @GetMapping("private")
    public String privatePage() {
        return "private";
    }

    @GetMapping("login")
    public String login() {
        return "login";
    }
}