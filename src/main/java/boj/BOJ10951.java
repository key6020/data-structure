package boj;

import java.util.Scanner;

public class BOJ10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
//            if (a > 0 && b < 10) {
                System.out.println(a + b);
//            }
        }
    }
}
