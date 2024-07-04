package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

//    Bean 옆에 이름을 지정 해줄 수 있음
    @Bean("member") //이러면 member라는 이름으로 찾을 수 있음
    public MemberDTO getMember() {
        System.out.println("getMember 호출함...");
        return new MemberDTO(1, "user01", "pass01", "홍길동");

    }
}
