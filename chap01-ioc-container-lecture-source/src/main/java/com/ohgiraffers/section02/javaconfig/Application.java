package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
                                                                            //클래스의 메타 정보
        // 우리가 만든 친구 public MemberDTO getMember() { -> 이름이 메소드명(getMember)으로 지정되기 때문에 찾을 수 없음
        MemberDTO member = context.getBean("getMember", MemberDTO.class);

        // @Bean("이름")을 이용해서 ID를 메소드명과 다르게 지정해줄 수 있다.
        MemberDTO member2 = context.getBean("member", MemberDTO.class);
        System.out.println(member);


    }
}
