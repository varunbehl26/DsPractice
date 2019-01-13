package com.company.stacksandqueues;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NonRepeatingChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            int len = in.nextInt();
            List<Character> linkedList = new ArrayList<Character>();
            boolean[] repeatedArray = new boolean[256];

            for (int i = 0; i < len; i++) {
                String val = in.next();
                checkValue(linkedList, repeatedArray, val.toCharArray());
            }
            System.out.println();
        }
    }

    private static void checkValue(List<Character> linkedList, boolean[] repeatedArray, char[] val) {
        char charVal = val[0];
        if (!repeatedArray[charVal]) {
            if (linkedList.contains(charVal)) {
                linkedList.remove((Character) charVal);
                repeatedArray[charVal] = true;
            } else {
                linkedList.add(charVal);
            }
        }
        if (linkedList.size() >= 1) {
            System.out.print(linkedList.get(0) + " ");
        } else {
            System.out.println(-1 + " ");
        }
    }


}