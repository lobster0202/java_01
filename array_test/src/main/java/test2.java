import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        /* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 *로 가려서 출력하세요.
         *
         * -- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *
         * -- 출력 예시 --
         * 990101-1***** */

        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하세요 :");
        String num = sc.nextLine();     // "990101-1234567"
        String[] ch = new String[num.length()];
//        String[] ch = new String[20];

        for (int i = 0; i < num.length() ; i++) {
//          (성준이 방법) ch[i] = num.charAt(i) + "";
//          (힌트 방법)  ch[i] = String.valueOf(num.charAt(i));
            ch[i] = String.valueOf(num.charAt(i));
            System.out.println("ch[] : " + Arrays.toString(ch));
        }
        for( int j = num.length() - 6; j < num.length(); j++) {
            ch[j] = "*";
        }

        for (int k = 0; k < num.length(); k++) {
            System.out.print(ch[k]);
        }
    }
}
