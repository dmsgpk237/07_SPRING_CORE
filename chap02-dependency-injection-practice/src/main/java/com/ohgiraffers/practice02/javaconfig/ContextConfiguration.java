package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {
    @Bean("member") //이러면 member라는 이름으로 찾을 수 있음
    public MemberDTO getMember() {
        return new MemberDTO(1L, "으네감쟈");

    }

    @Bean("board")
    public BoardDTO getBoard() {
        return new BoardDTO(1L, "의존성 주입 연습", "게시글의 작성자 객체를 주입 받아볼게요!", getMember());
    }
}
