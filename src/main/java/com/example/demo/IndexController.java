package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String start(Model model ) {



        return "index";
    }

    @GetMapping("/spel")
    public String getGameplaySite() {
        return "game";
    }







}

