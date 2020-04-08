package boj;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] menus = new int[5];
        for (int i = 0; i < menus.length; i++) {
            menus[i] = Integer.parseInt(sc.nextLine());
        }

        int[] hamburgers = new int[3];
        for (int h = 0; h < hamburgers.length; h++) {
            hamburgers[h] = menus[h];
        }

        int[] drinks = new int[2];
        for (int d = 0; d < drinks.length; d++) {
            drinks[d] = menus[menus.length - drinks.length + d];
        }

        Arrays.sort(hamburgers);
        Arrays.sort(drinks);

        System.out.println(hamburgers[0] + drinks[0] - 50);
    }
}
