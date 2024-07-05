package com.ohgiraffers.section01.autowired.common;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// @Component의 세분화(다른 사람들이 봤을 때 얘가 어떤 역할을 하는 클래스인지 알 수 있게)
// 어노테이션의 한 종류로 DAO(데이터베이스에 접근하는 클래스) 타입의 객체에 사용한다.
@Repository("bookDAO")
public class BookDAOImpl implements BookDAO{

    private Map<Integer, BookDTO> bookList;

    public BookDAOImpl() {
        bookList = new HashMap<>();

        bookList.put(1, new BookDTO(1, 123456, "자바의 정석", "남궁석", "도우출판", LocalDate.now()));
        bookList.put(2, new BookDTO(2, 234567, "칭찬은 고래도 춤추게 한다", "고래", "고래출판", LocalDate.of(1999, 12, 20)));

    }

    @Override
    public List<BookDTO> selectBookList() {
        return new ArrayList<>(bookList.values());
    }

    @Override
    public BookDTO selectOneBook(int sequence) {
        return bookList.get(sequence);
    }


}
