package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.calculator;
import static com.ohgiraffers.section01.method.calculator.maxNumberOf;

public class appication2 {
    public static void main(String[] args) {
        /* 임포트란?
        * 서로 다른 패키지에 존재하는 클래스를 사용하는 경우,
        * 매번 풀 클래스 네임을 기술하기가 번거롭다.
        * 그래서 어떠한 패키지 내에 있는 클래스를 사용할 것인지 대해
        * 미리 선언하는 임포트문을 사용하면 풀 클래스 네임을 매번 작성하지 않아도 된다. */

        /* non-static 메소드 */
        calculator calc = new calculator();
        int min = calc.minNumberOf(50, 60);

        System.out.println("50과 60중 더 작은 값은? : " + min);

        /* static 메소드 */
        int max = calculator.maxNumberOf(50, 60);
        System.out.println("더 큰 수는? : " + max);

        /* 동일한 클래스 내에 작성된 static 메소드는 클래스명 생략 가능*/

        int max2 = maxNumberOf(100,200);

        //(석현) 위에 굳이 안쓰고 오류 뜨면 import 클래스 뭐시기 뜨는데 그거 눌러서 하는 방법도 있음
    }
}
