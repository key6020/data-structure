package programmers;

public class HashOne {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"119", "97674223", "1195524421"}));
        System.out.println(solution(new String[]{"123", "456", "789"}));
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        for (int i = 0; i < phone_book.length; i++) {
            int hash = phone_book[i].hashCode();
            int length = phone_book[i].length();
            for (int j = i + 1; j < phone_book.length; j++) {
                if (phone_book[j].length() >= length && hash == phone_book[j].substring(0, length).hashCode()) {
                    return false;
                } else if (phone_book[j].length() < length && phone_book[i].substring(0, phone_book[j].length()).hashCode() == phone_book[j].hashCode()) {
                    return false;
                }
            }
        }
        return true;
    }

}
