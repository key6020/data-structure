package boj;

import java.util.Scanner;
import java.util.stream.Stream;

public class BOJ2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = Stream.of(String.valueOf(sc.nextInt()).split("")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Stream.of(String.valueOf(sc.nextInt()).split("")).mapToInt(Integer::parseInt).toArray();

        int[] num1 = new int[arr1.length];
        int[] num2 = new int[arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            num1[i] = arr1[arr1.length - i - 1];
            num2[i] = arr2[arr2.length - i - 1];
        }

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int n : num1) {
            sb1.append(n);
        }
        for (int n : num2) {
            sb2.append(n);
        }

        System.out.println(Math.max(Integer.parseInt(sb1.toString()), Integer.parseInt(sb2.toString())));
    }
}
