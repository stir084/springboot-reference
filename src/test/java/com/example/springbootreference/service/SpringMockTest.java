package com.example.springbootreference.service;

import com.example.springbootreference.domain.Student;
import com.example.springbootreference.domain.StudentRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;

@SpringBootTest
public class SpringMockTest {
    
    @MockBean //Mock객체를 스프링 컨텍스트에 등록해서 사용.
    private StudentRepository studentRepository;

    @Autowired
    private StudentService studentService;

    @Test
    public void createOrderTest() {

        Mockito.when(studentRepository.findAll()).then(invocation -> {
            System.out.println("I'm mock orderRepository");
            return Collections.emptyList();
        });


        // when
        studentService.getSchoolName();
    }
}
