package com.luiz.backendschool.domain;

import com.luiz.backendschool.DTOs.StudentRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity(name="student")
@Table(name="student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    @Column(unique = true)
    private int registration;
    private float average;

    public Student(StudentRequestDTO studentRequest){
        this.name = studentRequest.name();
        this.average = studentRequest.average();
        this.registration = studentRequest.registration();
    }
}
