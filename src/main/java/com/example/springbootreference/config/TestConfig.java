package com.example.springbootreference.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
    @Bean
    public void Test() {
    }
    // 객체를 Json 메세지로 변경하기 위해 Gson과 같은 외부 라이브러리를 사용한다고 하자.
    // 그러면 해당 클래스를 싱글톤 빈으로 등록해주어야 1개의 객체만 생성하여 여러 클래스가 공유함으로써 메모리 상의 이점을 얻을 수 있을 것이다.
    // 그런데 해당 클래스는 우리가 만든게 아니라 가져다 쓰는 클래스일 뿐이므로 불가피하게 @Bean으로 등록해줘야만 한다.

}
