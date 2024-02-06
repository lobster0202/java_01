import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        /*일단 세준이는 자기 점수 중에 최댓값을 골랐다.
         이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.        // 최대값 = M
         예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.    // 계산법: a / b * 100

         세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오. */

        /* 첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다.   // 0< N <= 1000
        둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다. */     // 0 <= 현재 성적 <= 100

        // 첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.

        Scanner sc = new Scanner(System.in);
        System.out.println("과목의 갯수를 고르시오 : ");
        int subjectNum = sc.nextInt();
        System.out.println("과목의 점수를 적으시오 : ");
        int a = sc.nextInt();
        System.out.println("과목의 점수를 적으시오 : ");
        int b = sc.nextInt();
        System.out.println("과목의 점수를 적으시오 : ");
        int c = sc.nextInt();



        int d = Math.max( Math.max(a,b),c);
        int e = Math.min( Math.min(a,b),c);

        double avg = d / c * 100;











    }


}
