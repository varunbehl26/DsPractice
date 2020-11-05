package com.company.easy.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreaterCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {12, 1, 12};

        List<Boolean> list = kidsWithCandies(input, 10);
        for (Boolean aBoolean : list) {
            System.out.println(aBoolean);
        }
    }
}
