package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class IndexController {
@Autowired
private TrashRepository trashRepository;

@Autowired
private TrashCanRepository trashCanRepository;

    @GetMapping("/")
    public String start(Model model ) {

        return "index";
    }

    @GetMapping("/spel")
    public String getGameplaySite(Model model) {
        model.addAttribute("trashArray", trashRepository.getTrash());
        model.addAttribute("trashCanArray",trashCanRepository.getTrashCans());
        return "game";
    }


}

