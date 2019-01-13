package com.company.gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SaveIronMan {

    public static void main(String[] args) {
        //code
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int testCases;
        try {
            testCases = (int) Integer.parseInt(br.readLine());
            while (testCases > 0) {
                String actualString = br.readLine();
                if (!actualString.isEmpty())
                    checkPalin(actualString);
                testCases--;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void checkPalin(String val) {
        String lowerval = val.toLowerCase();
        //string asc 97-122
        //number asci 48-57
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int j = val.length() - 1;
        for (int i = 0; i < val.length(); i++) {
            int asciValu = lowerval.charAt(i);
            if (asciValu >= 97 && asciValu <= 122 || (asciValu >= 48 && asciValu <= 57)) {
                if (!hashMap.containsKey(asciValu)) {
                    hashMap.put(asciValu, 0);
                }
                hashMap.put(asciValu, hashMap.get(asciValu) + 1);
            }
        }
        int count = 1;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                if (count == 1) {
                    count--;
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}
