package com.example.springbootreference.service;

import com.example.springbootreference.domain.StudentRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Collections;

public class NonSpringMockTest {
    private StudentService studentService;

    @Test
    public void createOrderTest() {
        // given
        StudentRepository studentRepository = Mockito.mock(StudentRepository.class);
        studentService = new StudentService(studentRepository);
        // Autowired로 스프링 의존성 주입이 아닌 Mock 객체로 의존성 주입

        Mockito.when(studentRepository.findAll()).then(invocation -> { //서비스의 해당 메소드가 실행 될 때는 Mock으로 대체하기 때문에 서비스 내에서 실행되는 코드가 있어야함.
            System.out.println("I'm mock orderRepository"); //기대행위(Stub) 작성
            return Collections.emptyList();
        });

        // when
        studentService.getSchoolName(); //stub 되지 않은 메소드들에 대해서는 Mockito에서 Answers.RETURNS_DEFAULTS에 따라 메소드 타입별로 정의된 메소드들을 실행하게 됩니다.
    }
}
