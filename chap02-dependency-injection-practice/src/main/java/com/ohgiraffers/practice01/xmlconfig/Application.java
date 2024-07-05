package com.ohgiraffers.practice01.xmlconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Application {
    public static void main(String[] args) {
        // spring-context.xml 설정 파일을 기반으로 ApplicationContext 타입의 IoC Container 를 생성한다.
        ApplicationContext context = new GenericXmlApplicationContext("com/ohgiraffers/practice01/xmlconfig/spring-context.xml");

        //  BoardDTO 타입의 bean 객체를 IoC Container 에서 꺼내
        BoardDTO board = context.getBean(BoardDTO.class);

        // 콘솔에 출력한다.
        System.out.println(board);


    }

}
