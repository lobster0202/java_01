package com.hw1.run;

import com.hw1.dto.Employee;
import com.hw1.dto.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] Stu = new Student[3];
        Stu[0] = new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
        Stu[1] = new Student("김말똥",21,187.3,80.0,2,"경영학과");
        Stu[2] = new Student("강개순",23,167.0,45.0,4,"정보통신공학과");

        for (Student Slist : Stu) {
            System.out.println(Slist.information());
        }

//        Employee[] Emp1 = new Employee[3];     [직원 1, null, null ....]
//        int i = 0;
//        while (true) {
//                System.out.print("이름을 입력해주세요 : ");
//                String name = sc.next();
//
//                System.out.print("나이를 입력해주세요 : ");
//                int age = sc.nextInt();
//
//                System.out.print("키를 입력해주세요 : ");
//                double height = sc.nextDouble();
//
//                System.out.print("몸무게를 입력해주세요 : ");
//                double weight = sc.nextDouble();
//
//                System.out.print("급여를 입력해주세요 : ");
//                int salary = sc.nextInt();
//
//                System.out.print("부서를 입력해주세요 : ");
//                String dept = sc.next();
//
//                Emp1[i] = new Employee(name,age,height,weight,salary,dept);
//
//                System.out.println(Emp1[i].information());
//
//                System.out.println("계속 입력 하시겠습니까?");
//            String str = sc.next();
//            if (str.equals("y") || str.equals("Y")) {
//
//            } else {
//                break;
//            }
//        }
//        System.out.println("입력 종료");
//        for (Employee Emp2 : Emp1 ) {
//            System.out.println(Emp2.information());
//        if (Emp2 == null)
//                break;
//        }



        Employee[] Emp1 = new Employee[10];

        int i =0;

        while (i <= 10) {

            System.out.print("이름을 입력해주세요 : ");
            String name = sc.next();

            System.out.print("나이를 입력해주세요 : ");
            int age = sc.nextInt();

            System.out.print("키를 입력해주세요 : ");
            double height = sc.nextDouble();

            System.out.print("몸무게를 입력해주세요 : ");
            double weight = sc.nextDouble();

            System.out.print("급여를 입력해주세요 : ");
            int salary = sc.nextInt();

            System.out.print("부서를 입력해주세요 : ");
            String dept = sc.next();

            Emp1[i] = new Employee(name,age,height,weight,salary,dept);

            System.out.println(Emp1[i].information());

            System.out.println("계속 입력 하시겠습니까?");
            String str = sc.next();

            if (str.equals("y") || str.equals("Y")) {
            } else {
                break;
            }
        }
        System.out.println("입력 종료");

        for (int j = i; i > 0; j-- ) {
            System.out.println(Emp1[i].information());
        }
    }
}
