package com.sharath.students.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="course_data")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseId;
    private String courseName;
   /*@ManyToMany(mappedBy = "courses")
    private List<Student> students;
    @JsonIgnore
    @OneToMany(mappedBy = "course")
    private List<Book> books; */
}
