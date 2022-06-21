package com.sharath.students.service;

import com.sharath.students.entity.Student;
import com.sharath.students.repository.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    private StudentRespository studentRespository;

    public Student saveStudent(Student student){
        return studentRespository.save(student);
    }
    public List<Student> saveStudents(List<Student> students){
        return studentRespository.saveAll(students);
    }
    public List<Student> getStudents(){
        return studentRespository.findAll();
    }
    public Student getStudentByName(String name){
        return studentRespository.findByStudentName(name);
    }
    public Student getStudentById(int id){
        return studentRespository.findById(id).orElse(null);
    }
    public String deleteStudent(int id){
         studentRespository.deleteById(id);
        return "Sucessfully Student removed having id"+id;
    }
   public  Student updateStudents(Student student){
      Student existingStudent=studentRespository.findById(student.getStudentId()).orElse(null);
      existingStudent.setStudentName(student.getStudentName());
      existingStudent.setStudentEmail(student.getStudentEmail());
      existingStudent.setAge(student.getAge());
      return   studentRespository.save(existingStudent);
    }

}
