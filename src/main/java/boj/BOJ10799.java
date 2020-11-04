package boj;

import java.util.Scanner;

public class BOJ10799 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int total = 0;

        String line = sc.nextLine();

        for (int i = 0; i < line.length() - 1; i++) {
            String cur = line.substring(i, i + 1);
            String next = line.substring(i + 1, i + 2);

            if (cur.endsWith("(")) {
                if (next.equals("(")) {
                    cnt += 1;
                } else {
                    total += cnt;
                    i++;
                }
            } else {
                total += 1;
                cnt -= 1;
            }
        }

        total += 1;
        System.out.println(total);
    }
}
