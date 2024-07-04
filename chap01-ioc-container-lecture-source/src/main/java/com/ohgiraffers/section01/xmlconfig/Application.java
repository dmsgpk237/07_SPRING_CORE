package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");


//        MemberDTO member = new MemberDTO();

        // ioc 사용
        MemberDTO member = (MemberDTO) context.getBean("member");
        // spring-context에서 <bean id="member" 이렇게 이름을 우리가 지정하기 때문에 object 타입으로 다 생성됨, 그래서 만든 DTO로 다운 캐스팅을 해줘야 함.

        System.out.println(member);




    }
}
