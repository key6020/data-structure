package data_structure;

import java.util.LinkedList;

public class StackPalindrome {
    // Using a stack, determine whether a string is a palindrome.

    public static void main(String[] args) {
        System.out.println(isPalindrome("abccba"));
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
        System.out.println(isPalindrome("I did, did I?"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("Don't nod"));
    }

    public static boolean isPalindrome(String input) {

        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder strinWithoutPunctuation = new StringBuilder(input.length());
        String lowerCoase = input.toLowerCase();

        for(int i=0; i <lowerCoase.length(); i++) {
            char c = lowerCoase.charAt(i);
            if(c >= 'a' && c <= 'z') {
                strinWithoutPunctuation.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversedString = new StringBuilder(stack.size());
        while(!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString().equals(strinWithoutPunctuation.toString());
    }
}
