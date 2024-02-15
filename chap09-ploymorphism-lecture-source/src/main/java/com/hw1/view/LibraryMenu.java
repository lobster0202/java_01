package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {

        System.out.println("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("성별을 입력하세요 : ");
        char gender = sc.nextLine().charAt(0);

        Member mem = new Member(name,age,gender);
        LibraryManager lm = new LibraryManager();
        lm.insertMember(mem);

        label:
        while (true) {
            System.out.println("원하는 메뉴를 선택하세요");
            switch (sc.nextInt()) {
                case 1 : lm.myInfo(); break;
                case 2 : lm.selectAll(); break;
                case 3 : lm.searchBook(); break;
                case 4 : lm.rentBook(); break;
                case 0 :
                    System.out.println("프로그램을 종료합니다"); break label;
                default:
                    System.out.println("잘못 입력하셨습니다.");   break;

            }

        }


    }

    public void selectAll() {
        LibraryManager lm = new LibraryManager();
        Book[] bList = lm.selectAll();

        for (int i = 0; i < bList.length; i++) {
            System.out.println(i + "번도서 : " + );

        }


    }
    public void searchBook() {
        System.out.println("검색할 제목 키워드 :");
        String keyword = sc.nextLine();
        LibraryManager lm = new LibraryManager();
        Book[] searchList = lm.searchBook(keyword);

        for (Book bk : searchList) {
            System.out.println(bk.toString());
            if (bk.toString() == null) {
                break;
            }
        }
    }
    public void rentBook() {
        LibraryManager lm = new LibraryManager();
        lm.selectAll();
    }

    public LibraryManager getLm() {
        return lm;
    }

    public void setLm(LibraryManager lm) {
        this.lm = lm;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

}
