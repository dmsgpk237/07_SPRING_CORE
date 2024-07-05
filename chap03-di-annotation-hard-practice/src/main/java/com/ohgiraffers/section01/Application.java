package com.ohgiraffers.section01;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Scanner;

public class                                   Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ApplicationContext context = new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");

        MemberDTO member = context.getBean(MemberDTO.class);

        System.out.println(member);

        System.out.println(member.getPersonalAccount());

        // 입금
        System.out.println("입금할 급액을 입력해주세요 : ");
        int good = sc.nextInt();
        System.out.println(member.getPersonalAccount().deposit(good));

        // 잔액 출력
        System.out.println(member.getPersonalAccount().getBalance());

        // 출금
        System.out.println("출금할 금액을 입력해주세요 : ");
        int bad = sc.nextInt();
        System.out.println(member.getPersonalAccount().withdraw(bad));

        // 출금 후 잔액 출력
        System.out.println(member.getPersonalAccount().getBalance());
    }
}
