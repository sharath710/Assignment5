package com.sharath.students.repository;

import com.sharath.students.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRespository extends JpaRepository<Student,Integer> {
    Student findByStudentName(String name);
}
