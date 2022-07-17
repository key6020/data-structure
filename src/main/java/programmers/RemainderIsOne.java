package programmers;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RemainderIsOne {
    public static void main(String[] args) {
        log.info(solution(10) + "");
        log.info(solution(12) + "");
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
