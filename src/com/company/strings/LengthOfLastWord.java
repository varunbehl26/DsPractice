package com.company.strings;

public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("the sky is blue"));
    }
    public static String lengthOfLastWord(final String A) {
        String[] strings=A.trim().split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = strings.length-1; i >=0; i--) {
            stringBuilder.append(strings[i]);
            stringBuilder.append(" ");
        }


        return stringBuilder.toString().trim();
    }

}
