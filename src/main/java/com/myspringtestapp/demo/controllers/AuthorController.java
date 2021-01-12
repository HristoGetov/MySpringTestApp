package com.myspringtestapp.demo.controllers;

import com.myspringtestapp.demo.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAllAuthors(Model model){


        model.addAttribute("authors",authorRepository.findAll());
        return "author/list";
    }
}