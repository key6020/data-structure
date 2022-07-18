package programmers;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TargetNumber {
    public static void main(String[] args) {
        log.info(solution(new int[]{1, 1, 1, 1, 1}, 3) + "");
        log.info(solution(new int[]{4, 1, 2, 1}, 4) + "");
    }

    private static int answer;

    // dfs
    public static int solution(int[] numbers, int target) {
        answer = 0;
        dfs(numbers, target, 0, 0);
        return answer;
    }

    private static void dfs(int[] numbers, int target, int index, int sum) {
        if (index == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }
        dfs(numbers, target, index + 1, sum + numbers[index]);
        dfs(numbers, target, index + 1, sum - numbers[index]);
    }
}
