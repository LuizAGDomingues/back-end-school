package com.luiz.backendschool.services;

import com.luiz.backendschool.DTOs.StudentRequestDTO;
import com.luiz.backendschool.domain.Student;
import com.luiz.backendschool.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){ return studentRepository.findAll(); }

    public Student findStudentByID(String id) throws Exception {
        return studentRepository.findById(id).orElseThrow(() -> new Exception("Estudante não encontrado"));
    }

    public Student createStudent(StudentRequestDTO studentRequest){
        Student newStudent = new Student(studentRequest);
        return studentRepository.save(newStudent);
    }

    public Student updateStudent(StudentRequestDTO studentRequest, String id) throws Exception {
        this.deleteStudent(id);
        Student newStudent = new Student(studentRequest);
        return studentRepository.save(newStudent);
    }

    public void deleteStudent(String id){
        studentRepository.deleteById(id);
    }
}
