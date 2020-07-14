package com.company.gfg.must.easy;

import java.util.HashMap;

public class IsomorphicStrings {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("ab", "ca"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.isEmpty() || t.isEmpty()) {
            return true;
        }
        HashMap<Character, Character> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (map.containsKey(sChar)) {
                if (!map.get(sChar).equals(tChar)) {
                    return false;
                }
            } else {
                if (map.containsValue(tChar)) {
                    return false;
                } else {
                    map.put(sChar, tChar);
                }

            }
        }
        return true;
    }
}
