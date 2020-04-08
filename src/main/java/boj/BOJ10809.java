package boj;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabets = alphabet.toCharArray();
        char[] input = str.toCharArray();
        Integer[] answer = new Integer[alphabets.length];

        for (int i = 0; i < alphabets.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (alphabets[i] == input[j] && answer[i] == null) {
                    answer[i] = j;
                }
            }
        }
        System.out.println(Arrays.toString(answer).replaceAll("null", "-1").substring(1).replaceFirst("]", "").replaceAll(",", ""));
    }
}
