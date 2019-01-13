package com.company.misc;

public class AddONe {

    public static void main(String[] args) {
        int arr[] = {9, 9, 9};
        int n = arr.length;
        addNumber(arr);
        System.out.println("Array after rearranging: ");
        printArray(arr);
    }

    private static void addNumber(int[] arr) {
        int factor = 0;

        int j = arr.length - 1;
        if (arr[j] + 1 <= 9) {
            arr[j] = arr[j] + 1;
        } else {
            int value = arr[j] + 1;
            arr[j] = value % 10;
            factor = value / 10;
        }

        for (j = arr.length - 2; j > 0; j--) {
            if (arr[j] + 1 <= 9) {
                arr[j] = arr[j] + factor;
                factor = 0;
            } else {
                int value = arr[j] + 1;
                arr[j] = value % 10;
                factor = value / 10;
            }
        }
        int[] newArr;
        if (arr[0] > 9) {
            newArr = new int[arr.length + 1];
            newArr[0] = 1;
            System.arraycopy(arr, 0, newArr, 1, newArr.length - 1);
        } else {
            newArr = arr;
        }
        arr = newArr;
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }

    }

    private static void printArray(int[] arr) {
//        for (int anArr : arr) {
//            System.out.print(anArr +" ");
//        }

    }

}
