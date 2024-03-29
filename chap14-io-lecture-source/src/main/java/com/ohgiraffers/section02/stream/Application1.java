package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {

        /* [stream]
         * 외부 데이터를 대상으로 작업할 때, 가장 먼저 해야할 일은
         * 자바 프로그램과 외부 데이터를 연결하는 것이다.
         * (외부 데이터란 프로그램 외부에 존재하는 모든 데이터를 의미한다.)
         *
         * 프로그램과 외부 데이터가 연결된 길을 스트림(stream)이라고 한다.
         * 데이터를 출력하기 위한 길은 출력 스트림이라고 부른다.
         *
         * [java.io]
         * 입출력과 관련된 API패키지이다.
         *
         * InputStream과 Reader는 데이터를 읽어오는 입력 스트림이고,
         *
         * OutputStream과 Writer는 데이터를 내보내는 출력 스트림이다.
         *
         * InputStream과 OutputStream은 1byte 단위로 입/출력을 하고,
         *
         * Reader와 Writer는 문자(2byte or 3byte) 단위로 작업을 한다.
         *
         *
         * 자바 프로그램과 연결되는 외부 데이터의 타입이
         * 무엇인지는 클래스의 이름을 보고 유추가 가능하다.
         * InputStream / OutputStream / Reader / Writer 를 빼고
         * 남는 단어가 바로 외부 데이터의 타입이다.                     */

        FileInputStream fin = null;

        // try-catch로 해도 오류가 발생하는데 이런 예외는 존재하지 않기 때문에  오류가 난다.
        // read도 예외 처리를 해줘야 하는 메소드다

        try {
            fin = new FileInputStream("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");
            int value;
//            while ((value = fin.read()) != -1) {
//                System.out.println(value);
//                System.out.println((char)value);                        //이렇게 하나씩 하는건 굉장히 비효율적인 행동임
//            }
            System.out.println("파일의 길이 : " + new File("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt").length());

            int fileSize = (int)new File("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt").length();
            byte[] bar = new byte[fileSize];

            fin.read(bar);
            for (int i = 0; i < bar.length; i++) {
                System.out.println((char) bar[i]);
            }



            //File 클래스의 file은 long타입이라서 형 변환을 해줘야 함

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fin != null) {
                try {
                    fin.close();
                    /* 자원 반납을 해야 하는 이유
                    * 1. 장기간 실행중인 프로그램에서 스트림을 닫지 않는 경우 다양한 리소스에서 누수(leak) 발생.
                    * 2. 뒤에서 배우는 버퍼를 이용하는 경우 마지막에 flush()로 버퍼에 있는 데이터를 강제로 전송해야한다.
                    *    만약 잔류 데이터가 남은 상황에서 추가로 스트림을 사용하면 데드락(deadlock) 상태가 된다.
                    *
                    *    이런 상황을 판단하기 어렵고 의도치 않은 상황에서
                    *    이런 현상이 발생할 수 있으므로 마지막에는 flush() 를 해주는 것이 좋다.
                    *
                    *    close() 메소드는 자원을 반납하면서 flush()까지 해주므로 close()만 제대로 해줘도 된다.
                    * => 따라서 close() 메소드는 외부 자원을 사용한 경우 마지막에 반드시 호출해야 한다.           */
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
