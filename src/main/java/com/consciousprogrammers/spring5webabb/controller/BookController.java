package com.consciousprogrammers.spring5webabb.controller;


import com.consciousprogrammers.spring5webabb.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {


    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/get/all")
    public String getBooks(Model model){

        model.addAttribute("books", bookRepository.findAll() );

        return "books";
    }
}
