package programmers;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;

@Slf4j
public class MockTest {
    public static void main(String[] args) {
        log.info(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        log.info(Arrays.toString(solution(new int[]{1, 3, 2, 4, 2})));
        log.info(Arrays.toString(solution(new int[]{1, 3, 2, 4, 2, 3, 4})));
    }

    public static int[] solution(int[] answers) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] answer = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (arr1[i % arr1.length] == answers[i]) {
                answer[0] += 1;
            }
            if (arr2[i % arr2.length] == answers[i]) {
                answer[1] += 1;
            }
            if (arr3[i % arr3.length] == answers[i]) {
                answer[2] += 1;
            }
        }
        int max = Math.max(answer[0], Math.max(answer[1], answer[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if (max == answer[0]) {
            list.add(1);
        }
        if (max == answer[1]) {
            list.add(2);
        }
        if (max == answer[2]) {
            list.add(3);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
