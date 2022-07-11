package programmers;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrimeNumber {
    public static void main(String[] args) {
        log.info(solution(new int[]{1, 2, 3, 4}) + "");
        log.info(solution(new int[]{1, 2, 7, 6, 4}) + "");
    }

    public static int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrimeNumber(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    private static boolean isPrimeNumber(int number) {
        if (number == 2) {
            return true;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
