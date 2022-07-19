package programmers;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class KakaoStringCompression {
    public static void main(String[] args) {
        log.info(solution("aabbaccc") + "");
        log.info(solution("ababcdcdababcdcd") + "");
        log.info(solution("abcabcdede") + "");
        log.info(solution("abcabcabcabcdededededede") + "");
        log.info(solution("xababcdcdababcdcd") + "");
    }

    public static int solution(String s) {
        int answer = s.length();
        for (int i = 1; i <= s.length() / 2; i++) {
            StringBuilder sb = new StringBuilder();
            String cut = s.substring(0, i);
            int count = 1;
            for (int j = i; j <= s.length(); j += i) {
                String next = s.substring(j, Math.min(j + i, s.length()));
                if (cut.equals(next)) {
                    count++;
                } else {
                    sb.append(count == 1 ? "" : count);
                    sb.append(cut);
                    cut = next;
                    count = 1;
                }
            }
            sb.append(cut);
            answer = Math.min(answer, sb.toString().length());
        }
        return answer;
    }
}
