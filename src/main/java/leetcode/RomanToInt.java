package leetcode;

import java.util.HashMap;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RomanToInt {

	public static void main(String[] args) {
		log.info("{}", romanToInt("III"));
		log.info("{}", romanToInt("LVIII"));
		log.info("{}", romanToInt("MCMXCIV"));
	}

	public static int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int answer = 0;
		int cur = 0;
		int prev;
		for (int i = 0; i < s.length(); i++) {
			prev = cur;
			cur = map.get(s.charAt(i));

			if (prev < cur) {
				answer -= prev;
				answer += (cur - prev);
			} else {
				answer += cur;
			}
		}
		return answer;
	}
}
