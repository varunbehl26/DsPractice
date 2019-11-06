package com.company.interviewbit.arrays;

import java.util.ArrayList;

//The algo is to put the number on the position they need to be
//evaluate number from starting the number which is not equal to number -1 that is the required number
public class FirstMissingPositive {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(-1);
        list.add(1);
        System.out.println(firstMissingPositive(list));
    }

    private static int firstMissingPositive(ArrayList<Integer> arr) {

        //start with the  first number and continue till end
        // position will be the number -1 as values start from zero
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            int pos = num - 1;

            //keep setting the number on position
            if (pos >= 0 && pos < arr.size() && arr.get(pos) != num) {
                //set the element from the array
                arr.set(i, arr.get(pos));
                //keep setting the number on position
                arr.set(pos, num);
                i--;
            }
        }

        //check whether the next number is equal to previous number plus one
        for (int i = 0; i < arr.size(); i++)
            if (arr.get(i) != i + 1)
                return i + 1;

        return arr.size() + 1;
    }
}
