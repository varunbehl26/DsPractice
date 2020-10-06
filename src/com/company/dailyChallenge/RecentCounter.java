package com.company.dailyChallenge;

class RecentCounter {

    int count;

    public RecentCounter() {
        count = 0;
    }

    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        recentCounter.ping(1);     // requests = [1], range is [-2999,1], return 1
        recentCounter.ping(100);   // requests = [1, 100], range is [-2900,100], return 2
        recentCounter.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], return 3
        recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3
    }

    public int ping(int t) {

        return -1;
    }
}