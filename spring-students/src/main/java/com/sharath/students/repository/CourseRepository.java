package com.sharath.students.repository;

import com.sharath.students.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
   // Course findByCourseName(String name);
}
