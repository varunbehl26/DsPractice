package com.company.interviewbit.strings;

public class Palindrome {

    public static void main(String[] args) {
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(isPalindrome("1a2"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static int isPalindrome(String A) {
        //97--122
        String lowerCase = A.toLowerCase();
        char character = 'z';
        int ascii = (int) character;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < lowerCase.length(); i++) {
            int i1 = lowerCase.charAt(i);
            if ((i1 >= 97 && i <= 122) || (i1 >= 48 && i <= 57)) {
                stringBuilder.append(lowerCase.charAt(i));
            }
        }

        String value = stringBuilder.toString();
        String reversedString = stringBuilder.reverse().toString();


        if (value.equals(reversedString)) {
            return 1;
        }
        return 0;
    }


}
