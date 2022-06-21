package com.sharath.students.service;

import com.sharath.students.entity.Book;
import com.sharath.students.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book){
        return bookRepository.save(book);

    }
    public List<Book> saveBooks(List<Book> book){
        return bookRepository.saveAll(book);
    }
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }
    public Book getBookById(int id){
        return bookRepository.findById(id).orElse(null);
    }
    public String deleteBookById(int id){
        bookRepository.deleteById(id);
        return "Sucessfully deleted from the table having the book id is ="+id;
    }
    public Book updateBook(Book book){
        Book existingBook=bookRepository.findById(book.getBookId()).orElse(null);
        existingBook.setBookName(book.getBookName());
        return bookRepository.save(existingBook);

    }
}
