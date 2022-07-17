package com.example.springbootreference.service;

import com.example.springbootreference.domain.Student;
import com.example.springbootreference.domain.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Service
@Slf4j
public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    private EntityManager em;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Transactional
    public void getSchoolName(){
        List<Student> studentList = studentRepository.findAll();
        if(studentList.size() > 0){
            //throw new OrderDuplicateException();
        }
    }
}