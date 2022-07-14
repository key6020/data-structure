package programmers;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class GCDAndLCM {
    public static void main(String[] args) {
        log.info(Arrays.toString(solution(3, 12)));
        log.info(Arrays.toString(solution(2, 5)));
    }

    public static int[] solution(int n, int m) {
        int gcd = getGCD(Math.max(n, m), Math.min(n, m));
        return new int[]{gcd, n * m / gcd};
    }

    private static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }
}
