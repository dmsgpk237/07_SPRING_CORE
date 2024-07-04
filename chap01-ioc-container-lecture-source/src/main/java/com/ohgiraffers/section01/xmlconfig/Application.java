package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");


//        MemberDTO member = new MemberDTO();

        // ioc 사용(객체의 생명주기를 스프링에게 위임하는 것)
        // ID(이름)으로 값 꺼내오기
        MemberDTO member = (MemberDTO) context.getBean("member");
        // spring-context에서 <bean id="member" 이렇게 이름을 우리가 지정하기 때문에 object 타입으로 다 생성됨, 그래서 만든 DTO로 다운 캐스팅을 해줘야 함.
        System.out.println(member);

        // 타입으로 값 꺼내오기
        MemberDTO member2 = context.getBean(MemberDTO.class);
        /* 타입으로 값을 꺼내올 때는, MemberDTO 타입으로 등록된 빈이 하나가 아닐 수 있기 때문에 모호성 에러가 발생할 수 있다. */

        //모호성 방지하며 꺼내오는 방법 {타입과 ID(이름)으로 값 꺼내오기}
        MemberDTO member3 = context.getBean("member", MemberDTO.class);
        System.out.println(member3);




    }
}
