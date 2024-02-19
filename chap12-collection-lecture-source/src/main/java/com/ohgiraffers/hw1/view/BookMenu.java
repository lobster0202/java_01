package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
    Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public void mainMenu() {

        while (true) {
            System.out.println("========== 도서 관리 프로그램 =========");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색 출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");

            System.out.print("원하는 메뉴를 선택하세요 : ");
            switch (sc.nextInt()) {
                case 1:
                    bm.addBook(inputBook());
                    break;
                case 2:
                    bm.printBookList(selectSortedBook());
                    break;
                case 3:
                    bm.deleteBook(inputBookNo());
                    break;
                case 4:
                    bm.searchBook(inputBookTitle());
                    break;
                case 5:
                    bm.displayAll();
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }

    }

    public BookDTO inputBook() {
        String title;
        int category = 0;
        int bNo;


        //도서 번호 : 입력 받음
        //(오답노트) 틀린 파트만 다시 하게 만들고 싶으면 continue와 while문을 사용하면 된다!
        while (true) {
            System.out.print("도서의 번호를 입력하세요 : ");
            bNo = sc.nextInt();
            if (bNo < 1) {
                System.out.println("도서의 번호를 양수로 입력해주세요.");
                continue;
            }
            System.out.println(bNo);
            break;          // 올바른 입력이 들어왔을 때 반복문 종료
        }
        sc.nextLine();

        System.out.print("도서의 제목을 입력하세요 : ");
        title = sc.nextLine();


        while (true) {

            System.out.println("도서 장르 = 1:인문, 2:자연과학, 3:의료, 4:기타 ");
            System.out.print("도서의 장르를 숫자로 선택하세요 : ");
             category = sc.nextInt();
            if (category < 1 || category > 4) {
                System.out.println("1~4 사이의 숫자를 입력하세요");
                continue;
            }
            System.out.println(category);
            break;
        }
        sc.nextLine();

            System.out.print("도서의 저자를 입력하세요 : ");
            String author = sc.nextLine();

            BookDTO bd = new BookDTO(bNo, category, title, author);

            return bd;
    }

    //도서 번호로 도서 삭제
    public int inputBookNo() {

        System.out.print("도서 번호를 입력하세요 : ");
        int number = sc.nextInt();

        return number;
    }
    //도서 검색 출력
    public String inputBookTitle() {
        String title;
        System.out.print("도서 제목을 입력하세요 : ");
        title = sc.nextLine();

        return title;
    }
    public List<BookDTO> selectSortedBook() {

        System.out.println("=========정렬 순서 선택========");
        System.out.println("1. 도서번호 기준 오름차순 정렬");
        System.out.println("2. 도서번호 기준 내림차순 정렬");
        System.out.println("3. 책 제목 기준 오름차순 정렬");
        System.out.println("4. 책 제목 기준 내림차순 정렬");
        System.out.print("도서 정렬 방식을 선택하시오 : ");

        int number = sc.nextInt();

        return bm.sortedBookList(number);

    }
}
