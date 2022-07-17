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

    /**
     * 트랜잭션 적용 안됨
     */
    public void findAllSchoolNames1(){
        getSchoolName1();
    }

    @Transactional
    public void getSchoolName1(){
        List<Student> studentList = studentRepository.findAll();
        if(studentList.size() > 0){
            //throw new OrderDuplicateException();
        }
    }
}