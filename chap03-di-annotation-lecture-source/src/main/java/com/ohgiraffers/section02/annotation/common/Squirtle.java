package com.ohgiraffers.section02.annotation.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// 꼬부기
@Primary // 우선순위 지정해주는 것

/*
* [@Primary]
*  - @Autowired로 동일한 타입의 여러 bean을 찾게 되는 경우 자동으로 연결 될 우선 시 할 타입 설정
*  - 동일한 타입의 클래스 중 한 개만 @Primary 어노테이션을 사용할 수 있다.
* */

@Component
public class Squirtle implements Pokemon{
    @Override
    public void attack() {
        System.out.println("🌊💧꼬부기 물대포 발사!💧🌊");
    }
}
