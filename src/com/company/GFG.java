package com.company;

import java.util.HashSet;
import java.util.Set;

public class GFG {

    public static void main(String[] args) {
//        System.out.println(numJewelsInStones("z", "ZZ"));
//        System.out.println(isPalindrome(121));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int numJewelsInStones(String J, String S) {

        int num = 0;
        for (int i = 0; i < J.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (J.charAt(i) == S.charAt(j)) {
                    num++;
                }
            }
        }

        return num;

    }

//    public static boolean isValid(String s) {
//        Stack<Character> stack = new Stack();
//
//        for(int i = 0; i<s.length(); i++) {
//            // Push any open parentheses onto stack
//            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
//                stack.push(s.charAt(i));
//                // Check stack for corresponding closing parentheses, false if not valid
//            else if(s.charAt(i) == ')' && !stack.empty() && stack.peek() == '(')
//                stack.pop();
//            else if(s.charAt(i) == ']' && !stack.empty() && stack.peek() == '[')
//                stack.pop();
//            else if(s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{')
//                stack.pop();
//            else
//                return false;
//        }
//
//        return true;
//    }

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
            if (x > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return rev;
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            int temp = x;
            int rev = 0;
            while (x != 0) {
                rev = rev * 10 + x % 10;
                x = x / 10;
            }
            return temp == rev;
        }
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], (maxEndingHere + nums[i]));
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }
        return maxSoFar;

    }
}
