package com.hw1.controller;

import com.hw1.model.dto.AniBook;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.CookBook;
import com.hw1.model.dto.Member;

public class LibraryManager {
    private Member mem = null;
    private Book[] bList = new Book[5];
    {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    public void insertMember(Member mem) {

    }
    public Member myInfo() {
        System.out.println("마이페이지");
        return mem.hashCode();
    }
    public Book[] selectAll() {

    }
    public Book[] searchBook(String keyword) {

        return
    }
    public int rentBook(int index) {

        if (index == 0) {
              System.out.println("성공적으로 대여되었습니다.");
        }else if(index == 1) {
            System.out.println("나이 제한으로 대여가 불가능합니다.");
        }else if (index == 2) {
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
        }


    }

    public Member getMem() {

        return mem;
    }

    public void setMem(Member mem) {

        this.mem = mem;
    }

    public Book[] getbList() {

        return bList;
    }

    public void setbList(Book[] bList) {

        this.bList = bList;
    }
}
