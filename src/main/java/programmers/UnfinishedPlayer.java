package programmers;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

@Slf4j
public class UnfinishedPlayer {
    public static void main(String[] args) {
        log.info(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        log.info(solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
        log.info(solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }

    // sorting
//    public static String solution(String[] participant, String[] completion) {
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//
//        int i = 0;
//        for (; i < completion.length; i++) {
//            if (!completion[i].equals(participant[i])) {
//                break;
//            }
//        }
//        return participant[i];
//    }

    // hash
    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        String answer = "";
        for (String m : map.keySet()) {
            if (map.get(m) != 0) {
                answer = m;
            }
        }
        return answer;
    }
}
