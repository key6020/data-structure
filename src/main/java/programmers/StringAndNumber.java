package programmers;

import java.util.HashMap;

public class StringAndNumber {
    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
        System.out.println(solution("23four5six7"));
        System.out.println(solution("2three45sixseven"));
        System.out.println(solution("123"));
    }

    public static int solution(String s) {
        int answer = 0;

        HashMap<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        StringBuilder temp1 = new StringBuilder();
        StringBuilder temp2 = new StringBuilder();

        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                temp1.append(c);
            } else {
                temp2.append(c);
                if (temp2.length() >= 3) {
                    if (map.get(temp2.toString()) != null) {
                        temp1.append(map.get(temp2.toString()));
                        temp2.delete(0, temp2.length());
                    }
                }
            }
        }

        answer = Integer.parseInt(temp1.toString());
        return answer;
    }
}
