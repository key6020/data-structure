package programmers;

import java.util.Arrays;

public class PlusMinusSum {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 7, 12}, new boolean[]{true, false, true}));
        System.out.println(solution(new int[]{1, 2, 3}, new boolean[]{false, false, true}));
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        for (int i = 0; i < absolutes.length; i++) {
            if (!signs[i]) {
                absolutes[i] = -absolutes[i];
            }
        }

        return Arrays.stream(absolutes).sum();
    }
}
