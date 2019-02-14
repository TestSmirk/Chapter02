package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

@RestController
public class BookController {
    @GetMapping("/book")
    public Book book() {
        Book book = new Book();
        book.setAuthor("罗贯中");
        book.setName("三国演义");
        book.setPrice(30.0f);
        book.setPublicationDate(new Date());
        return book;
    }

}
