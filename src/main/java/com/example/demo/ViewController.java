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

        model.addAttribute("score", game.getScore());


        return "start";
    }

    @GetMapping("/game")
    public String getGameplaySite(Model model) {



        model.addAttribute("level", game.getLevel());
        model.addAttribute("ground-url", game.getGround());
        model.addAttribute("url", game.getBackground());
        model.addAttribute("score", game.getScore());
        model.addAttribute("trashArray", game.getCurrentTrash());
        model.addAttribute("trashCanArray", trashCanRepository.getTrashCans());


        return "game";
    }


    @GetMapping("/vinst")
    public String getWinSite() {

        return "win";
    }


}



