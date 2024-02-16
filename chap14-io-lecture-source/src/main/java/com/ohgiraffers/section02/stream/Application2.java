package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {
        /* [FileRader]                                  // try-catch문 써야함
        * FileInputStream과 사용하는 방법이 거의 동일하다.
        * 단, byte 단위가 아닌 character 단위로 읽어 들이는 부분이 차이점이다.
        * 따라서 2바이트던 3바이트던 글자 단위로 읽어오기 때문에 한글을 정상적으로 읽어올 수 있다. */

        FileReader fr = null;
        try {
            fr = new FileReader("src/main/java/com/ohgiraffers/section02/stream/testReader.txt");

            /*위에 읽었던 걸 주석 처리를 해야지 아래에 있는 for문이 정상 작동된다. */
//            int value;
//            while ((value = fr.read()) != -1) {                 // -1은 값이 있을때는 순차적으로 읽어오는데 더 이상 읽을게 없으면 -1을 반환함
//                System.out.println((char) value);
//            }

            char[] carr = new char[(int)new File("src/main/java/com/ohgiraffers/section02/stream/testReader.txt").length()];
            fr.read(carr);

            for (int i = 0; i < carr.length; i++) {
                System.out.print(carr[i]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
