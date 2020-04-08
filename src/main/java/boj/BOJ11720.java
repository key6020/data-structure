package boj;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BOJ11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = Integer.parseInt(sc.nextLine());
        String numbers = sc.nextLine();
        int[] arr = Stream.of(String.valueOf(numbers).split("")).mapToInt(Integer::parseInt).toArray();

        System.out.println(IntStream.of(arr).sum());
    }
}
