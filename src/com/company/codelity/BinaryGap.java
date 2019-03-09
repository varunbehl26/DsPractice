package com.company.codelity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryGap {

    public static void main(String[] args) {
        System.out.println(solution(32));
    }

    public static int solution(int N) {
        // write your code in Java SE 8

        String binary = Integer.toBinaryString(N);
        char[] chars = binary.toCharArray();

        List<Integer> indexes = new ArrayList();
        List<Integer> differencesIndex = new ArrayList();

        for (int i = 0; i < binary.length(); i++) {
            if (chars[i] == '1') {
                indexes.add(i);
            }
        }

        for (int i = 0; i < indexes.size() - 1; i++) {
            differencesIndex.add(indexes.get(i + 1) - indexes.get(i));
        }
        Collections.sort(differencesIndex);
        System.out.println(binary);

        if (differencesIndex.size() > 0) {
            return differencesIndex.get(differencesIndex.size() - 1) - 1;
        } else {
            return 0;
        }
    }
}