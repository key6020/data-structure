package programmers;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MiddleCharacter {
    public static void main(String[] args) {
        log.info(solution("abcde"));
        log.info(solution("qwer"));
        log.info(solution("aabbcc"));
        log.info(solution("aa"));
    }

    public static String solution(String s) {
        int length = s.length();
        if (length % 2 == 0) {
            return s.substring(length / 2 - 1, length / 2 + 1);
        } else {
            return s.charAt(length / 2) + "";
        }
    }
}
