package com.company.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class RemoveDuplicate {
    public static void main(String[] args) {
        //code
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int tests = 0;
        try {
            tests = br.read();
            while (tests-- != 0) {
                String actualString = br.readLine();
                check(actualString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void check(String actualString) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = actualString.toCharArray();
        for (int i = 0; i < actualString.length(); i++) {
            if (map.containsKey(chars[i])) {
                map.put(chars[i], map.get(chars[i]) + 1);
            } else {
                map.put(chars[i], 1);
            }
        }
        for (int i = 0; i < actualString.length(); i++) {
            if (map.containsKey(chars[i])) {
                if (map.get(chars[i]) == 2) {
                    System.out.print(chars[i]);
                    map.put(chars[i], 0);
                } else if (map.get(chars[i]) == 1) {
                    System.out.print(chars[i]);
                }

            }
        }
    }
}