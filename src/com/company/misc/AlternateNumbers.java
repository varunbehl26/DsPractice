package com.company.misc;

public class AlternateNumbers {

    public static void main(String[] args) {
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int n = arr.length;
        rearrange(arr, n);
        System.out.println("Array after rearranging: ");
        printArray(arr);
    }

    private static void rearrange(int[] arr, int length) {


    }


    private static void printArray(int[] arr) {
        for (int anArr : arr) {
            System.out.println(anArr);
        }

    }
}
