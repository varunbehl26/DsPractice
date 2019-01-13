package com.company.tzom;

public class AGreaterB {

    public static void main(String[] args) {
        System.out.println(solve(22, 44));
    }

    public static int solve(int A, int B) {
        int count = 0;
        if (A == B) {
            return count;
        } else if (A > B) {
            while (B < A) {
                B = B + 2;
                count++;
            }
            if (A == B) {
                return count;
            }
        } else {
            while (A < B) {
                A = A + 2;
                count++;
            }
            if (A == B) {
                return count;
            }
        }
        return count;

    }
}
