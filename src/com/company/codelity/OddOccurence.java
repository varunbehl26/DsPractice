package com.company.codelity;

import java.util.HashMap;
import java.util.Map;

public class OddOccurence {


    public static void main(String[] args) {
        System.out.println(solution(32));
    }

    public static int solution(int N) {
        // write your code in Java SE 8
        int[] A = new int[7];

        A[0] = 9;
        A[1] = 3;
        A[2] = 9;
        A[3] = 3;
        A[4] = 9;
        A[5] = 7;
        A[6] = 9;

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i1 : A) {
            if (hashMap.get(i1) != null) {
                hashMap.remove(i1);
            } else {
                hashMap.put(i1, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet())
            System.out.println(entry.getKey());
        return -1;

    }
}