package leetcode;

import java.util.Objects;

public class IsPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(1000021));
        System.out.println(isPalindrome(111));
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(1234));
        System.out.println(isPalindrome(12344321));
        System.out.println(isPalindrome(123454321));
        System.out.println(isPalindrome(1234521));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String[] palindromeArray = String.valueOf(x).split("");
        int length = palindromeArray.length;
        for (int i = 0; i < length; i++) {
            if (Objects.equals(palindromeArray[i], palindromeArray[length - i - 1])) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }
}
