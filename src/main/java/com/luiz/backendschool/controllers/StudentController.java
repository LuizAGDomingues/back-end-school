package com.luiz.backendschool.controllers;

import com.luiz.backendschool.DTOs.StudentRequestDTO;
import com.luiz.backendschool.domain.Student;
import com.luiz.backendschool.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents(){return studentService.getAllStudents();}

    @GetMapping("/{studentId}")
    public Student getStudentById(@PathVariable String studentId) throws Exception {return studentService.findStudentByID(studentId);}

    @PostMapping("/create")
    public Student createStudent(@RequestBody StudentRequestDTO student){
        return studentService.createStudent(student);
    }

    @PostMapping("/update/{studentId}")
    public Student updateStudent(@RequestBody StudentRequestDTO student, @PathVariable String studentId) throws Exception {
        return studentService.updateStudent(student, studentId);
    }

    @DeleteMapping("/delete/{studentId}")
    public void deleteStudent(@PathVariable String studentId){
        studentService.deleteStudent(studentId);
    }
}
