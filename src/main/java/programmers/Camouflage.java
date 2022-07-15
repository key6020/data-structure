package programmers;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

@Slf4j
public class Camouflage {
    public static void main(String[] args) {
        log.info(solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}) + "");
        log.info(solution(new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}) + "");
    }

    // hash : 종류별로 경우의 수를 구해야 할 때
    public static int solution(String[][] clothes) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String[] clothe : clothes) {
            hashMap.put(clothe[1], hashMap.getOrDefault(clothe[1], 0) + 1);
        }

        int answer = 1;
        for (Integer value : hashMap.values()) {
            answer *= value + 1;
        }

        return answer - 1;
    }
}
