package com.company.gfg.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFreq {

    public static void main(String[] args) {

    }

    public List<Integer> topKFrequentApproach2(int[] nums, int k) {
        // Using sort. Time complexity: O(nlogn)
        ArrayList<Integer> ans = new ArrayList<>();
        if (nums == null || k > nums.length || k <= 0) {
            return ans;
        }
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int e : nums) {
            freqMap.put(e, freqMap.getOrDefault(e, 0) + 1);
        }

        for (Integer key : freqMap.keySet()) {
            ans.add(key);
        }

        ans.sort((a, b) -> {
            if (!freqMap.get(a).equals(freqMap.get(b)))
                return freqMap.get(b) - freqMap.get(a);
            return a - b;
        });

        return ans.subList(0, k);
    }

}
