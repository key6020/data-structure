package boj;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ1316 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        if (n > 100) {
            throw new Exception("n must not exceed 100.");
        }

        // 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = sc.nextLine();
            if(!strArr[i].matches("^[a-z]{1,100}$")) {
                throw new Exception("Input String Validation Failed.");
            }

            Set<String> set = new LinkedHashSet<>();
            String[] strings = strArr[i].split("");
            for (String c : strings) {
                set.add(c);
            }
            System.out.println(set);
        }


    }
}
