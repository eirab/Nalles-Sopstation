package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Scope("session")
public class ViewController {
    @Autowired
    private TrashRepository trashRepository;

    @Autowired
    private TrashCanRepository trashCanRepository;

    @Autowired
    private Game game;


    @GetMapping("/")
    public String start(Model model) {
        return "index";
    }

    @GetMapping("/spel")
    public String getGameplaySite(Model model) {

        model.addAttribute("trashArray", trashRepository.getTrash());
        model.addAttribute("trashCanArray",trashCanRepository.getTrashCans());
        return "game";
    }

    @GetMapping("/vinst")
    public String getWinSite() {
        return "win";
    }


}

