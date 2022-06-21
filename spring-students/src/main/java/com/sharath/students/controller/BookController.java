package com.sharath.students.controller;

import com.sharath.students.entity.Book;
import com.sharath.students.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
   private BookService bookService;

    @PostMapping("/addbook")
    public Book addBook(@RequestBody Book book){
        return bookService.saveBook(book);

    }
    @PostMapping("/addbooks")
    public List<Book> addBooks(@RequestBody  List<Book> books){
        return bookService.saveBooks(books);
    }
    @GetMapping("/books")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }
    @GetMapping("/getbookbyid/{id}")
    public Book getBookById(@PathVariable int id){
        return bookService.getBookById(id);
    }

    @DeleteMapping("/deletebookbyid/{id}")
    public String deleteBookById(@PathVariable int id){
        bookService.deleteBookById(id);
        return "Sucessfully deleted from the table where the book is having id is ="+ id;
    }
    @PutMapping("/updatebook")
    public Book updateBook(@PathVariable Book book){
        return bookService.updateBook(book);
    }
}
