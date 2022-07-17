package com.example.springbootreference.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<Student> students = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public void addStudent(Student student){
        this.students.add(student);
        student.updateSchool(this);
    }
}