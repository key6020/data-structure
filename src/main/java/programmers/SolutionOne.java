package programmers;

import java.util.HashMap;

public class SolutionOne {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }

    private static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> participantMap = new HashMap<>();
        for (String p : participant) {
            participantMap.put(p, participantMap.getOrDefault(p, 0) + 1);
        }

        String answer = "";
        for (String c : completion) {
            participantMap.put(c, participantMap.get(c) - 1);
        }
        for (String s : participantMap.keySet()) {
            if (participantMap.get(s) > 0) {
                answer = s;
            }
        }
        return answer;
    }
}
