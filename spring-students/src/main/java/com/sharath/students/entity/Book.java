package com.sharath.students.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Book_data")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;
    private String bookName;

   /*@ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "courseid", referencedColumnName ="courseId");

    @ManyToOne
    @JoinTable(name="book_author")
    private List<Author> author;*/
}
