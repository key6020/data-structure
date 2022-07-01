package programmers;

public class NewId {
    public static void main(String[] args) {
        System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(solution("z-+.^."));
        System.out.println(solution("=.="));
        System.out.println(solution("123_.def"));
        System.out.println(solution("abcdefghijklmn.p"));
        System.out.println(solution("...."));
    }

    public static String solution(String new_id) {
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^a-z\\d\\-_.]*", "");

        while (new_id.contains("..")) {
            new_id = new_id.replaceAll("\\.{2,}", ".");
        }

        if (new_id.startsWith(".")) {
            new_id = new_id.substring(1);
        }
        if (new_id.endsWith(".")) {
            new_id = new_id.substring(0, new_id.length() - 1);
        }
        if (new_id.length() == 0) {
//            new_id = new_id + "a".repeat(size);
            new_id = "a";
        }
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            if (new_id.endsWith(".")) {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }
        int length = new_id.length();
        if (length <= 2) {
            while (true) {
                new_id = new_id + new_id.charAt(new_id.length() - 1);
                length++;
                if (length == 3) {
                    break;
                }
            }
        }
        return new_id;
    }
}
