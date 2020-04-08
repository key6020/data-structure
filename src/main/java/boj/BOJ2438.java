package boj;

import java.util.Scanner;

public class BOJ2438 {
    public static void main(String[] args) {
//        첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            char[] stars = new char[i + 1];
            for (int j = 0; j < stars.length; j++) {
                stars[j] = '*';
            }
            System.out.println(String.valueOf(stars));
        }
    }
}
