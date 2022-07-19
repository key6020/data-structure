package programmers;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class FunctionDeployment {
    public static void main(String[] args) {
        log.info(Arrays.toString(solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
        log.info(Arrays.toString(solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            int day = (int) Math.ceil(((100 - progresses[i]) / (double) speeds[i]));
            int j = i + 1;
            for (; j < progresses.length; j++) {
                if (progresses[j] + day * speeds[j] < 100) {
                    break;
                }
            }
            answerList.add(j - i);
            i = j - 1;
        }
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}
