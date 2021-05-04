package com.company.arrays.easy;

public class AddOneToClass {

    /*
        Simple logic
        Start from end of array and continue making the digit 0 if equal to 9
        Else decrement,

        Return the function in middle, It need not return in the end
     */
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;

        return newNumber;
    }


    public static void main(String[] args) {
        int[] result = plusOne(new int[]{4, 9, 9, 9});
        for (int i : result) {
            System.out.println(result[i]);
        }

    }

//    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
//        int carr = 0;
//        int e;
//        ArrayList<Integer> result = new ArrayList<>();
//
//
//        for (int i = A.size() - 1; i >= 0; i--) {
//            if (i == A.size() - 1) {
//                e = A.get(i) + 1;
//            } else {
//                e = A.get(i) + carr;
//                carr = 0;
//            }
//
//            if (e >= 10) {
//                result.add(e % 10);
//                carr = e / 10;
//            } else {
//                result.add(e);
//            }
//
//        }
//        if (carr > 0) {
//            result.add(carr);
//        }
//        Collections.reverse(result);
//
//
//        while (checkIfFirstZero(result)) ;
//
//
//        for (Integer integer : result) {
//            System.out.println(integer);
//        }
//        return result;
//    }
//
//    private static boolean checkIfFirstZero(ArrayList<Integer> result) {
//        if (result.get(0) == 0) {
//            result.remove(0);
//            return true;
//        }
//        return false;
//    }

}
