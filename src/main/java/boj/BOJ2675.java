package boj;

import java.util.Scanner;

public class BOJ2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        int[] rounds = new int[t];
        String[] strings = new String[t];

        for (int i = 0; i < t; i++) {
            String tmp = sc.nextLine();
            rounds[i] = Integer.parseInt(tmp.split(" ")[0]);
            strings[i] = tmp.split(" ")[1];
        }

        for (int k = 0; k < t; k++) {
            String[] answers = strings[k].split("");
            for (String answer : answers) {
//                System.out.print(answer.repeat(rounds[k]));
            }
            System.out.println();
        }
    }
}
