package com.ohgiraffers.section02.annotation.common;

import org.springframework.stereotype.Component;

// 피카츄
@Component
public class Pikachu implements Pokemon{
    @Override
    public void attack() {
        System.out.println("💥🧨피카츄 백만볼트!🧨💥");
    }
}
