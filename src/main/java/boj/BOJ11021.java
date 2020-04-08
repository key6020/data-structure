package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer T = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(T.nextToken());

        for (int i = 0; i < t; i++) {
            StringTokenizer numbers = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(numbers.nextToken());
            int b = Integer.parseInt(numbers.nextToken());
            System.out.println(a + b);
        }
    }
}
