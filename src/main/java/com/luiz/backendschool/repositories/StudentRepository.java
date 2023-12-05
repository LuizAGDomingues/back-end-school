package com.luiz.backendschool.repositories;

import com.luiz.backendschool.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
}
