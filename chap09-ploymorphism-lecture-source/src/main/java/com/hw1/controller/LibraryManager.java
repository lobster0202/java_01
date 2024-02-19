package com.hw1.controller;

import com.hw1.model.dto.AniBook;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.CookBook;
import com.hw1.model.dto.Member;

public class LibraryManager {

    // mem이라는 필드를 선언하게 되면 Member 클래스의 인스턴스를 참조 할 수가 있음
    // 즉, Member 타입의 인스턴스를 새롭게 선언해서 Member 클래스의 메소드를 쓸 수 있음
    private Member mem = null;
    private Book[] bList = new Book[5];
    {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    /* insertMember라는 메소드를 통해 Member 클래스의 인스턴스를 mem 필드에 저장하는 것을 보여줍니다.
    * "여기서 insertMember(Member mem) 메소드는 Member 클래스의 인스턴스를 인자로 받아서,
    * 이를 내부 필드인 this.mem에 저장하는 역할을 합니다.
    * 이렇게 하면, 이 메소드를 호출한 곳에서 생성한 Member 객체를 현재 클래스에서 활용할 수 있게 됩니다. */
    public void insertMember(Member mem) {
        this.mem = mem;
    }
    public Member myInfo() {
        System.out.println("마이페이지");

        return this.mem;
    }
    public Book[] selectAll() {
        return this.bList;
    }
    public Book[] searchBook(String keyword) {

//        Book[] searchList = new Book[5];
//        int count = 0;                        //이거 카운트 알고리즘을 쓰는게 아니고 그냥 count라는 이름으로 선언하라는거 였음
//
//        for (int i = 0; i < bList.length; i++) {
//            if (bList[i].getTitile().contains(keyword)) {
//                searchList[count] = bList[i];
//                count++;
//            }
//        }
//        return searchList;


    }
    public int rentBook(int index) {

//        int result = 0;
//
//        if (bList[index] instanceof AniBook) {
//            if ((((AniBook) bList[index]).getAccessAge() > mem.getAge()) {
//                result = 1;
//            }
//        } else if (bList[index] instanceof CookBook) {
//            mem.setCouponCount(mem.getCouponCount() + 1);
//            result = 2;
//        }
//        return result;






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
