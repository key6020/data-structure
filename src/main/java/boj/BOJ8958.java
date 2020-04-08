package boj;

import java.util.Scanner;
import java.util.stream.Stream;

public class BOJ8958 {
    public static void main(String[] args) {
//        "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
//
//        "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
//
//                OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);

        int testCase = Integer.parseInt(sc.nextLine());
        String[] inputs = new String[testCase];

        for (int i = 0; i < testCase; i++) {
            inputs[i] = sc.nextLine();
            inputs[i] = inputs[i].replaceAll("O", "1").replaceAll("X", "0");
            int[] arr = Stream.of(String.valueOf(inputs[i]).split("")).mapToInt(Integer::parseInt).toArray();

            int score = 0;
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 1) {
                    cnt++;
                } else {
                    cnt = 0;
                }
                score = score + cnt;
            }
            System.out.println(score);
        }
    }
}
