package boj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr1 = new Integer[9];

        for (int i = 0; i < 9; i++) {
            arr1[i] = Integer.parseInt(sc.nextLine());
        }

        Integer[] arr2 = arr1.clone();
        Arrays.sort(arr2, Collections.reverseOrder());

        int index = 0;
        for (int j = 0; j < arr1.length; j++) {
            if (arr1[j] == arr2[0]) {
                index = j;
            }
        }

        System.out.println(String.format("%d\n%d", arr2[0], index+1));
    }
}
