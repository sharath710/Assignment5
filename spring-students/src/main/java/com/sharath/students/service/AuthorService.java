package com.sharath.students.service;

import com.sharath.students.entity.Author;
import com.sharath.students.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AuthorService {
    private AuthorRepository authorRepository;

    public Author saveAuthor(Author author){
        return authorRepository.save(author);

    }
    public List<Author> saveAuthors(List<Author> authors){
        return authorRepository.saveAll(authors);
    }
    public List<Author> getAuthors(){
        return authorRepository.findAll();
    }

    public Author getAuthorById(int id){
        return authorRepository.findById(id).orElse(null);
    }
    public String deleteAuthorById(int id){
        authorRepository.deleteById(id);
        return "sucessfully author remove having id id="+id;
    }
    public Author updateAuthor(Author author){
        Author existingAuthor=authorRepository.findById(author.getAuthorId()).orElse(null);
        existingAuthor.setAuthorName(author.getAuthorName());
        return authorRepository.save(existingAuthor);
    }
}
