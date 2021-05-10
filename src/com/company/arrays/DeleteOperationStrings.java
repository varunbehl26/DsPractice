package com.company.arrays;

public class DeleteOperationStrings {

    public static int minDistance(String s1, String s2) {
        return s1.length() + s2.length() - 2 * findLcs(s1, s2);
    }

    /*
        Longest common substring
        //https://www.notion.so/Lcs-Longest-common-subsequence-b6864820f4b54a80bdf414eee6b5afb9
     */
    static int findLcs(String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();


        int[][] dp = new int[s1Length + 1][s2Length + 1];

        for (int i = 0; i <= s1Length; i++) {
            for (int j = 0; j <= s2Length; j++) {
                if (i == 0 || j == 0) {
                    continue;
                }
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[s1Length][s2Length];
    }

    public static void main(String[] args) {
        System.out.println(minDistance("leetcode", "etco"));
    }
}
