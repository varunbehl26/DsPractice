package com.company.dailyChallenge.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

//    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
//        List<List<Integer>> resultsList = new ArrayList<>();
//
//        HashMap<Integer, Integer> map = new HashMap();
//        for (int i = 0; i < candidates.length; i++) {
//            map.put(candidates[i], 1);
//        }
//
//        for (int i = 0; i < candidates.length; i++) {
//            List<Integer> internalList = new ArrayList();
//            int[] indexArray = new int[target + 1];
//            for (int j = 0; j <= target; j++) {
//                indexArray[j] = target - i;
//            }
//            int outcome = indexArray[candidates[i]];
//            if (map.containsKey(outcome)) {
//                internalList.add(candidates[i]);
//                internalList.add(outcome);
//            }else {
//
//            }
//
//            resultsList.add(internalList);
//        }
//
//        return resultsList;
//    }
//
//    public static List<List<Integer>> combinationSum(int[] candidates, int t) {
//        Arrays.sort(candidates); // sort candidates to try them in asc order
//        List<List<List<Integer>>> dp = new ArrayList<>();
//
//        for (int i = 1; i <= t; i++) { // run through all targets from 1 to t
//            List<List<Integer>> newList = new ArrayList(); // combs for curr i
//            // run through all candidates <= i
//            for (int j = 0; j < candidates.length && candidates[j] <= i; j++) {
//                // special case when curr target is equal to curr candidate
//                if (i == candidates[j]) {
//                    newList.add(Arrays.asList(candidates[j]));
//                } else {
//                    // if current candidate is less than the target use prev results
//                    for (List<Integer> l : dp.get(i - candidates[j] - 1)) {
//                        if (candidates[j] <= l.get(0)) {
//                            List<Integer> list = new ArrayList<>();
//                            list.add(candidates[j]);
//                            list.addAll(l);
//                            newList.add(list);
//                        }
//                    }
//                }
//            }
//            dp.add(newList);
//        }
//        return dp.get(t - 1);
//    }

    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, target, 0);
        return list;
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start) {
        if (remain >= 0) {
            if (remain == 0) {
                list.add(new ArrayList<>(tempList));
            } else {
                for (int i = start; i < nums.length; i++) {
                    tempList.add(nums[i]);
                    // not i + 1 because we can reuse same elements
                    backtrack(list, tempList, nums, remain - nums[i], i);
                    tempList.remove(tempList.size() - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = combinationSum(candidates, target);
        for (List<Integer> list : result) {
            System.out.println("-------");
            if (list != null) {
                for (Integer integer : list) {
                    System.out.print(integer);
                    System.out.println(" ");
                }
            }
            System.out.println("-------");

        }

    }
}
