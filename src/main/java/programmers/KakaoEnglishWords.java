package programmers;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class KakaoEnglishWords {
    public static void main(String[] args) {
        log.info(solution("one4seveneight") + "");
        log.info(solution("23four5six7") + "");
        log.info(solution("2three45sixseven") + "");
        log.info(solution("123") + "");
    }

    public static int solution(String s) {
        StringBuilder sb = new StringBuilder();
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                temp = temp + c;
                int num = getNumberFromString(temp);
                if (num != 99) {
                    sb.append(num);
                    temp = "";
                }
            }
        }

        return Integer.parseInt(sb.toString());
    }

    private static int getNumberFromString(String s) {
        int num = 0;
        switch (s) {
            case "zero":
                num = 0;
                break;
            case "one":
                num = 1;
                break;
            case "two":
                num = 2;
                break;
            case "three":
                num = 3;
                break;
            case "four":
                num = 4;
                break;
            case "five":
                num = 5;
                break;
            case "six":
                num = 6;
                break;
            case "seven":
                num = 7;
                break;
            case "eight":
                num = 8;
                break;
            case "nine":
                num = 9;
                break;
            default:
                num = 99;
                break;
        }
        return num;
    }
}
