package com.ohgiraffers.practice01.xmlconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        /*
        * 1. 1번에서 생성한 `spring-context.xml` 설정 파일을 기반으로 `ApplicationContext` 타입의
        * `IoC Container` 를 생성한다.
        2. 1번에서 등록한 `BoardDTO` 타입의 `bean` 객체를
        * `IoC Container` 에서 꺼내 콘솔에 출력한다.
        * */

        // ioc 컨테이너 생성
        ApplicationContext context = new GenericXmlApplicationContext("com/ohgiraffers/practice01/xmlconfig/spring-context.xml");

        // ioc 컨테이너에서 bean 객체를 꺼내 콘솔에 출력
        BoardDTO board = (BoardDTO) context.getBean("board");
        System.out.println(board);

    }
}
