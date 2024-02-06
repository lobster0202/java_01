public class test3 {
    public static void main(String[] args) {
        /* [ 로또번호 생성기 ]
         * 6칸짜리 정수 배열을 하나 생성하고
         * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
         * 오름차순 정렬하여 출력하세요.
         * */

        int[] lotto = new int[6];
        int random = (int)(Math.random() * 45) + 1;

        for (int i = 0; i < 6 ; i++) {
            lotto[i] = random;
            System.out.print("첫번째 : " + lotto[i] + " ");

            if ((lotto[i] != lotto[1]) && (lotto[i] != lotto[2]) != (lotto[i] != lotto[3]) != (lotto[i] != lotto[4]) != (lotto[i] != lotto[5])) {
                lotto[i] = random;
            } else {
                lotto[i] = random;
                System.out.println("중복 : " + lotto[i]);
                i--;
            }

        }

        System.out.println();
        for (int j = 0; j < lotto.length; j++) {
            for (int k = j + 1; k < lotto.length; k++) {
                if (lotto[j] > lotto[k]) {
                    int temp = lotto[j];
                    lotto[j] = lotto[k];
                    lotto[k] = temp;
                }
            }
        }
        for (int j = 0; j < lotto.length; j++) {
            System.out.print("세번째 : " + lotto[j] + " ");
        }
        }

    }
