package programmers;

import java.util.Arrays;

public class Lotto {
    public static void main(String[] arggs) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

//        System.out.println(Arrays.toString(solution(lottos, win_nums)) + "");
//
//        int[] lottos = {0,0,0,0,0,0};
//        int[] win_nums = {38, 19, 20, 40, 15, 25};
//
//        System.out.println(Arrays.toString(solution(lottos, win_nums)) + "");
//
//        int[] lottos = {45, 4, 35, 20, 3, 9};
//        int[] win_nums = {20, 9, 3, 45, 4, 35};

        System.out.println(Arrays.toString(solution(lottos, win_nums)) + "");
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        if (Arrays.stream(lottos).allMatch(l -> l == 0)) {
            return new int[]{1, 6};
        }

        int match = 0;
        if (Arrays.stream(lottos).noneMatch(l -> l == 0)) {
            for (int winNum : win_nums) {
                for (int lotto : lottos) {
                    if (winNum == lotto) {
                        match++;
                    }
                }
            }
            answer[0] = returnValue(match);
            answer[1] = returnValue(match);
            return answer;
        }

        int higest = 0;
        int count = 0;
        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                higest += 1;
            } else {
                for (int num : win_nums) {
                    if (lottos[i] == num) {
                        count += 1;
                        break;
                    }
                }
            }
        }
        higest += count;

        answer[0] = returnValue(higest);
        answer[1] = returnValue(count);
        return answer;
    }

    public static int returnValue(int num) {
        switch (num) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}
