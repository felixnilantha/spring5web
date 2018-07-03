package com.consciousprogrammers.spring5webabb.controller;

import com.consciousprogrammers.spring5webabb.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/authors")
public class AuthorController  {


    private AuthorRepository authorRepository;


    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/get/all")
    public String getAuthours(Model model){

        model.addAttribute("authors", authorRepository.findAll());

        return "authors";
    }
}
