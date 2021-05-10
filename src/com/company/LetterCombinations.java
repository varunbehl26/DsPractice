package com.company;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinations {

    public static List<String> letterCombinations(String digits) {
        //Queue for DFS
        LinkedList<String> ans = new LinkedList<>();
        if (digits.isEmpty()) {
            return ans;
        }

        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");

        for (int i = 0; i < digits.length(); i++) {
            int numericValue = Character.getNumericValue(digits.charAt(i));

            while (ans.peek().length() == i) {
                String popString = ans.pop();
                char[] charArray = mapping[numericValue].toCharArray();
                for (char s : charArray)
                    ans.add(popString + s);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        List<String> output = letterCombinations("2349");

        for (String s : output) {
            System.out.println(s);
        }
    }
}
