package boj;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2941 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        /**
         * ljes=njak    6
         * ddz=z=   3
         * nljj     3
         * c=c=     2
         * c-evapc=ic-i     9
         * cimcirastes=ams=are      17
         * ljuljamsenanjihaljki       16
         * dz=epariz=eparetud-epare     20
         * abcc-c=dd-dz=efghijklljmnnjoprss=tuvzz=dzempersljjlljnjjnnjjdzz=d-z      52
         */

        // validation check 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
        if (input.length() > 100 || !input.matches("^[a-z-=]*$")) {
            throw new Exception("Validation Failed.");
        }

        String[] alphas = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        int cnt = 0;
        while (Arrays.stream(alphas).parallel().anyMatch(input::contains)) {
            for (String a : alphas) {
                if (input.contains(a)) {
                    cnt++;
                    input = input.replaceFirst(a, " ");
                }
            }
        }

        cnt += input.replaceAll(" ", "").length();
        System.out.println(cnt);
    }
}
