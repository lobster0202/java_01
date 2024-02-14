package com.ohgiraffers.level02.normal.student.run;

import com.ohgiraffers.level02.normal.student.model.vo.StudentVO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentVO st = new StudentVO();

        Scanner sc = new Scanner(System.in);
        System.out.print("학년을 입력하세요 : ");
        st.setGrade(sc.nextInt());
        System.out.print("반을 입력하세요 : ");
        st.setClassroom(sc.nextInt());
        System.out.print("이름을 입력하세요 : ");
        st.setName(sc.next());
        System.out.print("키를 입력하세요 : ");
        st.setHeight(sc.nextDouble());
        System.out.print("성별을 입력하세요 : ");
        st.setGender(sc.next().charAt(0));

        System.out.println("=============정답 출력==========");

        st.printInformation();




    }
}
