package com.ohgiraffers.practice03.annotationconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        // ioc 컨테이너 생성
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        // bean에서 dao 꺼내오기
        BoardDAO boardDAO = context.getBean("boardDAO", BoardDAO.class);
        System.out.println(boardDAO.selectBoard(1L));

        // sout 안에 boardDAO.insertBoard를 넣지 않으면 true 가 나오지 않음.
        System.out.println(boardDAO.insertBoard(new BoardDTO(3L, "스프링 수업 엄청 기다렸어요!", "많은 걸 얻어갈 수 있는 시간 되면 좋겠어요!", "봄이 올까요?")));
        System.out.println(boardDAO.selectBoard(3L));
    }
}
