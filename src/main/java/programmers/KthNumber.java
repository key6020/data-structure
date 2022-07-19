package programmers;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

@Slf4j
public class KthNumber {
    public static void main(String[] args) {
        log.info(Arrays.toString(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int c = 0; c < commands.length; c++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            int i = commands[c][0] - 1;
            int j = commands[c][1] - 1;
            int k = commands[c][2] - 1;
            for (; i <= j; i++) {
                arrayList.add(array[i]);
            }
            Collections.sort(arrayList);
            answer[c] = arrayList.get(k);
        }
        return answer;
    }
}
