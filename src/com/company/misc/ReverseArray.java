package com.company.misc;

public class ReverseArray {

    /* Driver program to test above functions */
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        leftRotate(arr, 2); // Rotate array by 2
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int anArr : arr) {
            System.out.println(anArr);
        }

    }

    private static void leftRotate(int[] arr, int rotation) {
        reverse(arr, 0, rotation - 1);
        reverse(arr, rotation, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

    }


    private static void reverse(int[] arr, int start, int end) {
        int temp = 0;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


}
