package com.sharath.students.service;

import com.sharath.students.entity.Course;
import com.sharath.students.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course saveCourse(Course course){
        return courseRepository.save(course);
    }
    public List<Course> saveCourses(List<Course> course){
        return courseRepository.saveAll(course);
    }
    public List<Course> getCourses(){
        return courseRepository.findAll();
    }
    public Course getCourseById(int id){
        return courseRepository.findById(id).orElse(null);
    }
    /*public String getCourseByName(String name){

         courseRepository.findByCourseName(name);
    return "Here is no data is having with the name having is ="+name;
    }*/
    public String deleteCourse(int id){
         courseRepository.deleteById(id);
         return "Sucessfully deleted data with the course name having id is ="+id;
    }
    public Course updateCourse(Course course){
        Course existingCourse=courseRepository.findById(course.getCourseId()).orElse(null);
        existingCourse.setCourseName(course.getCourseName());

        return courseRepository.save(existingCourse);
    }
}
