package programmers;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class AddMissingNumbers {
    public static void main(String[] args) {
        log.info(solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}) + "");
        log.info(solution(new int[]{5, 8, 4, 0, 6, 7, 9}) + "");
    }

    public static int solution(int[] numbers) {
        int answer = 0;
        List<Integer> numberList = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        List<Integer> originalList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        for (Integer i : originalList) {
            if (!numberList.contains(i)) {
                answer += i;
            }
        }
        return answer;
    }
}
