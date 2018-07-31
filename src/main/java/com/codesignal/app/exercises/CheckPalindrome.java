package com.codesignal.app.exercises;

public class CheckPalindrome {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("abac"));
    }
    public static boolean checkPalindrome(String inputString) {

        char[] charArray = inputString.toCharArray();
        String palindrome = "";
        //Jeżeli w pętli kosntruujemy Stringi ze względów wydajnościowych dobrze jest użwyać StringBuffera
        for (int i = charArray.length - 1; i >= 0; i--) {
            palindrome += charArray[i];
        }
        if (inputString.equals(palindrome)) {
            return true;
        } else {
            return false;
        }
    }
}

