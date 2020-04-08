package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer T = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(T.nextToken());

        int[] arr = new int[t];
        StringTokenizer numbers = new StringTokenizer(br.readLine());
        for (int i = 0; i < t; i++) {
            arr[i] = Integer.parseInt(numbers.nextToken());
        }
        Arrays.sort(arr);

        System.out.println(String.format("%d %d", arr[0], arr[t-1]));
    }
}
