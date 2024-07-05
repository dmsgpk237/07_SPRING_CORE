package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Application {
    public static void main(String[] args) {

        // java 설정 파일을 기반으로 ApplicationContext 객체 생성
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        MemberDTO member = context.getBean(MemberDTO.class);

        // member 출력
        System.out.println(" ");

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
