package com.company.gfg.must.easy;

//i * j 4
//i * j 6
//i * j 8
//i * j 6
//i * j 9
//Time complexity
//https://leetcode.com/problems/count-primes/discuss/473021/Time-Complexity-O(log(log(n)
//O(n) * O(1/2 + 1/3 + 1/5 + ... + 1/(last prime before n))
//= O(n) * O(log(log(n)))
//= O(nlog(log(n)))

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(primes(10));
    }

    private static int primes(int n) {
        boolean[] notPrime = new boolean[n];
        int resultCount = 0;
        for (int i = 2; i < n; i++) {
            if (!notPrime[i]) {
                resultCount++;
                for (int j = 2; i * j < n; j++) {
                    System.out.println("i * j " + (i * j));
                    notPrime[i * j] = true;
                }
            }
        }
        return resultCount;
    }
}
