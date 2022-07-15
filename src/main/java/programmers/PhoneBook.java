package programmers;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

@Slf4j
public class PhoneBook {
    public static void main(String[] args) {
        log.info(solution(new String[]{"119", "97674223", "1195524421"}) + "");
        log.info(solution(new String[]{"123", "456", "789"}) + "");
        log.info(solution(new String[]{"12", "123", "1235", "567", "88"}) + "");
    }

    // solution & loop
//    public static boolean solution(String[] phone_book) {
//        Arrays.sort(phone_book);
//
//        for (int i = 0; i < phone_book.length-1; i++) {
//            if(phone_book[i+1].startsWith(phone_book[i])) {
//                return false;
//            }
//        }
//        return true;
//    }

    // hash
    public static boolean solution(String[] phone_book) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String p : phone_book) {
            hashMap.put(p, 1);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 1; j < phone_book[i].length(); j++) {
                if (hashMap.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }
        return true;
    }
}
