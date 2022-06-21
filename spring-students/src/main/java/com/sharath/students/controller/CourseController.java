package com.sharath.students.controller;

import com.sharath.students.entity.Course;
import com.sharath.students.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/addcourse")
    public Course addCourse(@RequestBody Course course){
        return courseService.saveCourse(course);
    }

    @PostMapping("/addcourses")
    public List<Course> addCourses(@RequestBody List<Course> courses){
        return courseService.saveCourses(courses);
    }
    @GetMapping("/courses")
    public List<Course> findAllCourses(){
        return courseService.getCourses();
    }

    @GetMapping("/getcoursebyid/{id}")
    public Course getCourseById(@PathVariable int id){
        return courseService.getCourseById(id);
    }

   /* @GetMapping("/getcoursebyname/{name}")
    public String getCourseByName(@PathVariable String name){
        courseService.getCourseByName(name);
        return "These are the data having the course name is="+name;

    }*/
    @DeleteMapping("/deletecoursebyid/{id}")
    public String deleteCourseById(@PathVariable int id){
        courseService.deleteCourse(id);
        return "Sucessfully deleted the course is haiving id ="+id;
    }
    @PutMapping("/updatecourse")
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }
}
