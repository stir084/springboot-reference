package com.example.springbootreference.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class ComponentConfig {
    //스프링은 컴포넌트 스캔(Component Scan)을 사용해 @Component 어노테이션이 있는 클래스들을 찾아서 '자동'으로 빈 등록을 해준다.
    //출처: https://mangkyu.tistory.com/75 [MangKyu's Diary:티스토리]
}
