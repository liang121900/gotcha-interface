package com.webcam.gotcha.controller.pub;

import java.util.UUID;

import javax.validation.Valid;

import com.webcam.gotcha.Book;
import com.webcam.gotcha.BookSaved;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller(value = "/api/public/books")
public class BookController {

    @Post
    public BookSaved save(@Valid @Body Book book) {
        BookSaved bookSaved = new BookSaved();
        bookSaved.setName(book.getName());
        bookSaved.setIsbn(UUID.randomUUID().toString());
        return bookSaved;
    }
}
