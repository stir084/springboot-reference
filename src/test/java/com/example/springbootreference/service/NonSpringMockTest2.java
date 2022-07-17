package com.example.springbootreference.service;

import com.example.springbootreference.domain.StudentRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Collections;

public class NonSpringMockTest2 {
    @Mock
    private StudentRepository studentRepository;

    @InjectMocks //@InjectMocks 라는 어노테이션을 사용한다면 해당 클래스가 필요한 의존성과 맞는 Mock 객체들을 감지
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

