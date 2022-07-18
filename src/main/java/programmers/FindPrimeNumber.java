package programmers;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;

@Slf4j
public class FindPrimeNumber {

    public static void main(String[] args) {
        log.info(solution("17") + "");
        log.info(solution("011") + "");
    }

    private final static HashSet<Integer> numberSet = new HashSet<>();

    // brute force
    public static int solution(String numbers) {
        recursive("", numbers);
        int answer = 0;

        for (Integer num : numberSet) {
            if(num != 0 && num !=1) {
                if (isPrime(num)) {
                    answer++;
                }
            }
        }
        numberSet.clear();

        return answer;
    }

    private static void recursive(String comb, String others) {
        if (!comb.equals("")) {
            numberSet.add(Integer.parseInt(comb));
        }
        for (int i = 0; i < others.length(); i++) {
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
        }
    }

    private static boolean isPrime(int num) {
        int limit = (int) Math.sqrt(num);
        for (int i = 2; i <= limit; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
