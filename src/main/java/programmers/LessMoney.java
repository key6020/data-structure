package programmers;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LessMoney {
    public static void main(String[] args) {
        log.info(solution(3, 20, 4) + "");
    }

    public static long solution(int price, int money, int count) {
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += (long) price * i;
        }

        if (sum > money) {
            return sum - money;
        } else {
            return 0;
        }
    }
}
