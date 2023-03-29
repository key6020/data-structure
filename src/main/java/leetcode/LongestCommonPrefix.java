package leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LongestCommonPrefix {
	public static void main(String[] args) {
		log.info("{}", longestCommonPrefix(new String[] {"flower", "flow", "flight"}));
		// log.info("{}", longestCommonPrefix(new String[] {"dog", "racecar", "car"}));
	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}

		String pre = strs[0];
		for (int i = 1; i < strs.length; i++) { // pre 다음부터 비교
			while (strs[i].indexOf(pre) != 0) { // 자신과는 비교X
				pre = pre.substring(0, pre.length() - 1);
			}
		}

		return pre;
	}
}
