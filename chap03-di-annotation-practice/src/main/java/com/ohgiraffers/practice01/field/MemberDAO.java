package com.ohgiraffers.practice01.field;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

// 어노테이션의 한 종류로 DAO(데이터베이스에 접근하는 클래스) 타입의 객체에 사용한다.
@Repository
public class MemberDAO {
    private final Map<Long, MemberDTO> memberMap;
    
    public MemberDAO(){
        memberMap = new HashMap<>();
        memberMap.put(1L, new MemberDTO(1L, "유관순"));
        memberMap.put(2L, new MemberDTO(2L, "홍길동"));
    }

    public Map<Long, MemberDTO> selectMember(){

        return memberMap;
    };
}
