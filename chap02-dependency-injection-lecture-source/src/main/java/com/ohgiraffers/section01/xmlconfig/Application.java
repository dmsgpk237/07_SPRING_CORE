package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        // xml 설정 파일을 기반으로 ApplicationContext 생성(컨테이너)
        ApplicationContext context = new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");

        MemberDTO member = context.getBean(MemberDTO.class);

        // MemberDTO의 personalAccount 객체 출력
        System.out.println(member.getPersonalAccount());

        // 안에 있는 친구들도 잘 동작하는지 확인 10000000원 입금
        System.out.println(member.getPersonalAccount().deposit(10000000));

        // 잔액 출력
        System.out.println(member.getPersonalAccount().getBalance());

        // 5232520원 출금
        System.out.println(member.getPersonalAccount().withdraw(5232520));

        // 출금 후 잔액 출력
        System.out.println(member.getPersonalAccount().getBalance());



    }
}
