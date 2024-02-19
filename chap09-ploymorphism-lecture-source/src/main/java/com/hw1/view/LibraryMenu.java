package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {

        // 인텔리제이에서 controller와 view 한 화면에 두고 메소드를 적는게 도움이 된다.

        System.out.println("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("성별을 입력하세요 : ");
        char gender = sc.nextLine().charAt(0);

        Member mem = new Member(name,age,gender);
//        LibraryManager lm = new LibraryManager();  : 이미 맨 위에 선언했음 굳이 새롭게 선언하지 않아도 됨
        lm.insertMember(mem);

        label:
        while (true) {
            System.out.println("========== 메뉴 =========");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");




            System.out.println("원하는 메뉴를 선택하세요");
            switch (sc.nextInt()) {

                // 여기서 부르는 애들은 LibraryManager의 메소드가 아니라
                // LibraryMenu의 메소드 들을 호출해야함
                case 1 : lm.myInfo(); break;
                case 2 : selectAll(); break;
                case 3 : searchBook(); break;
                case 4 : rentBook(); break;
                case 0 :
                    System.out.println("프로그램을 종료합니다"); break label;
                default:
                    System.out.println("잘못 입력하셨습니다.");   break;

            }

        }


    }

    public void selectAll() {
//        LibraryManager lm = new LibraryManager();

        Book[] bList = lm.selectAll();

        for (int i = 0; i < bList.length; i++) {
            System.out.println(i + "번도서 : " + bList[i] );
        }

    }
    public void searchBook() {
        System.out.println("검색할 제목 키워드 :");
        String keyword = sc.nextLine();
//        LibraryManager lm = new LibraryManager();
        Book[] searchList = lm.searchBook(keyword);

        System.out.println("=== 검색 도서 목록 조회 ===");

//        for (Book bk: searchList){
//            if(bk != null)
//                System.out.println(bk);
//        }


        for (Book bk : searchList) {
            // System.out.println(bk.toString());       여기서 toString() 지워도 됨
            System.out.println(bk.toString());
            if (bk.toString() == null) {
                break;
            }
        }
    }
    public void rentBook() {
        LibraryManager lm = new LibraryManager();

        // LibraryManager의 selectAll()이 아니라
        // LibraryMenu의 selectAll()을 호출해야함
//        lm.selectAll();

        selectAll();


        Scanner sc = new Scanner(System.in);
        System.out.print("대여할 도서 번호 선택 : ");
        int index = sc.nextInt();

        int result =  lm.rentBook(index);



        if (result == 0) {
            System.out.println("성공적으로 대여되었습니다.");
        }else if(result == 1) {
            System.out.println("나이 제한으로 대여가 불가능합니다.");
        }else if (result == 2) {
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
        }


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
