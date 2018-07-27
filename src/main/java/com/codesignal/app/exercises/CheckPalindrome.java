package com.codesignal.app.exercises;

public class CheckPalindrome {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("abac"));
        System.out.println(checkPalindromePerfectSolutions("vdwsvdsv"));

    }

    public static boolean checkPalindrome(String inputString) {

        char[] charArray = inputString.toCharArray();
        String palindrome = "";
        for (int i = charArray.length - 1; i >= 0; i--) {

            palindrome += charArray[i];
        }


        if (inputString.equals(palindrome)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkPalindromePerfectSolutions(String inputString) {

        return inputString.equals(new StringBuilder(inputString).reverse().toString());

    }
}

