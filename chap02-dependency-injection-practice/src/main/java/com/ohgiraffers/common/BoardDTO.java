package com.ohgiraffers.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class BoardDTO {
    private Long id;
    private String title;
    private String content;
    private MemberDTO writer;
}
