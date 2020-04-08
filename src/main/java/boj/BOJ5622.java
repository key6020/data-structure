package boj;

import java.util.Scanner;

public class BOJ5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int sum = 0;
        String[] arr = input.split("");

        for (String a : arr) {
            if ("ABC".contains(a)) {
                sum += 3;
            } else if ("DEF".contains(a)) {
                sum += 4;
            } else if ("GHI".contains(a)) {
                sum += 5;
            } else if ("JKL".contains(a)) {
                sum += 6;
            } else if ("MNO".contains(a)) {
                sum += 7;
            } else if ("PQRS".contains(a)) {
                sum += 8;
            } else if ("TUV".contains(a)) {
                sum += 9;
            } else if ("WXYZ".contains(a)) {
                sum += 10;
            } else {
                sum += 11;
            }
        }
        System.out.println(sum);
    }
}
