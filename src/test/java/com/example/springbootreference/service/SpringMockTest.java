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

        Mockito.when(studentRepository.findAll()).then(invocation -> { //해당 메소드가 실행 될 때는 Mock으로 대체하기 때문에 Service 내에서 실행되는 코드가 있어야함.
            System.out.println("I'm mock orderRepository"); //기대행위(Stub) 작성
            return Collections.emptyList();
        });


        // when
        studentService.getSchoolName(); //stub 되지 않은 메소드들에 대해서는 Mockito에서 Answers.RETURNS_DEFAULTS에 따라 메소드 타입별로 정의된 메소드들을 실행하게 됩니다.
    }
}
