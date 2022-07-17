package programmers;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;

@Slf4j
public class Phoneketmon {
    public static void main(String[] args) {
        log.info(solution(new int[]{3, 1, 2, 3}) + ""); // 2
        log.info(solution(new int[]{3, 3, 3, 2, 2, 4}) + ""); // 3
        log.info(solution(new int[]{3, 3, 3, 2, 2, 2}) + ""); // 2
    }

    public static int solution(int[] nums) {
        int total = nums.length / 2;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }

        if (hashSet.size() > total) {
            return total;
        } else {
            return hashSet.size();
        }
    }
}
