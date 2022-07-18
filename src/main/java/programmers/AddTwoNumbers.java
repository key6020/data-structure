package programmers;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

@Slf4j
public class AddTwoNumbers {
    public static void main(String[] args) {
        log.info(Arrays.toString(solution(new int[]{2, 1, 3, 4, 1})));
        log.info(Arrays.toString(solution(new int[]{5, 0, 2, 7})));
    }

    public static int[] solution(int[] numbers) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                hashSet.add(numbers[i] + numbers[j]);
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>(hashSet);
        Collections.sort(arrayList);
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}
