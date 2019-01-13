package com.company.interviewbit.arrays;

public class AddNumber {

    public static void main(String[] args) {
        int[] vect = new int[]{1, -7, 8, 9};

        vect = plusOne(vect);

        for (int i = 0; i < vect.length; i++)
            System.out.print(vect[i] + " ");
    }

    public static int[] plusOne(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i] * Math.pow(10, arr.length - 1 - i);
        }
        temp = temp + 1;

        String val = temp + "";
        int[] newArr = new int[val.length()];

        for (int i = 0; i < val.length(); i++) {
            newArr[i] = Integer.parseInt(val.charAt(i) + "");
        }
        return newArr;
    }
}
