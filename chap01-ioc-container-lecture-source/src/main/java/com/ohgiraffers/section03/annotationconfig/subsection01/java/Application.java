package com.ohgiraffers.section03.annotationconfig.subsection01.java;

import com.ohgiraffers.common.MemberDAO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        /*
        * getBeanDefinitionNames : 스프링 컨테이너에서 생성된 bean들의 이름을 배열로 반환한다.
        * */

        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames){
            System.out.println("beanName : " + beanName);
        }

        MemberDAO memberDAO = context.getBean("memberDAO", MemberDAO.class);

        System.out.println(memberDAO.selectMember(1));
        System.out.println(memberDAO.selectMember(2));

        // sout 안에 boardDAO.insertBoard를 넣지 않으면 true 가 나오지 않음.
        System.out.println(memberDAO.insertMember(new MemberDTO(3, "user03", "pass03", "도라도라도라에몽")));
        System.out.println(memberDAO.selectMember(3));
    }
}
