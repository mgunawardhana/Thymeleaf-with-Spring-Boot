package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.stereotype.Controller
@CrossOrigin
public class Controller {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }
}
