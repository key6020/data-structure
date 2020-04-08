package boj;

import java.util.Scanner;

public class BOJ11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for(int i=0; i<t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(String.format("Case #%d: %d + %d = %d", i+1, a, b, a+b));
        }
    }
}
