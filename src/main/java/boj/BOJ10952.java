package boj;

import java.util.Scanner;

public class BOJ10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            if (a > 0 && b < 10) {
                System.out.println(a + b);
            } else {
                break;
            }
        }
    }
}
