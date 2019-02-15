package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;


@RestController
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(@ModelAttribute("b") Book book, @ModelAttribute("a") Author author) {
    return book.toString()+">>>"+author.toString();
    }

}
