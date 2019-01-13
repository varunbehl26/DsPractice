package com.company.tzom;

import java.util.Scanner;

public class StudentsHAppy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numbers = in.nextInt();
        int queries = in.nextInt();
        int[] numbersArray = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            numbersArray[i] = in.nextInt();
        }
        while (queries-- > 0) {
            for (int i = 0; i < queries; i++) {
                for (int j = 0; j < numbers; j++) {
                    int queryType = in.nextInt();
                    int L = in.nextInt();
                    int R = in.nextInt();
                    if (queryType == 1) {
                        numbersArray[L - 1] = R;
                    } else if (queryType == 2) {
                        fun1(numbersArray, L, R);
                    } else if (queryType == 3) {
                        fun2(numbersArray, L, R);
                    }
                }
            }
        }

    }

    static void fun1(int[] A, int L, int R) {
        int ans = 1;
        for (int i = 0; i < 31; i += 1) {
            int count = 0;
            for (int j = L; j <= R; j += 1) {
                if (unset_bits(A[j - 1]) == i) {
                    count += 1;
                }
            }
            if (count > 0) {
                ans = (ans * count) % (1000000007);
            }
        }
        System.out.println(ans);
    }

    static void fun2(int[] A, int L, int R) {
        int ans = 1;
        for (int i = 0; i < 31; i += 1) {
            int count = 0;
            for (int j = L; j <= R; j += 1) {
                if (set_bits(A[j - 1]) == i) {
                    count += 1;
                }
            }
            if (count > 0) {
                ans = (ans * count) % (1000000007);
            }
        }
        System.out.println(ans);
    }

    static int unset_bits(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if ((i & number) == 0) {
                count++;
            }
        }
        return count;
    }

    static int set_bits(int number) {
        int count = 0;
        while (number > 0) {
            count += number & 1;
            number >>= 1;
        }
        return count;
    }
}