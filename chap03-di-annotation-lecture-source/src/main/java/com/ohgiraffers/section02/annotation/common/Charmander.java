package com.ohgiraffers.section02.annotation.common;

import org.springframework.stereotype.Component;

// 파이리
@Component // 빈에 등록
public class Charmander implements Pokemon{

    @Override
    public void attack() {
        System.out.println("🔥🎇파이리 불꽃 공격!🎇🔥");
    }

}
