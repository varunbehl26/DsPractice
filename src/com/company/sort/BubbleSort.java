package com.company.sort;

public class BubbleSort {

    /*
        64, 25, 12, 22, 11
        25 64 12 22 11
        25 12 64 22 11
        25 12 22 64 11
        25 12 22 11 64
        ===========
        12 25 22 11 64
        12 22 25 11 64
        12 22 11 25 64
        ===========
        12 22 11 25 64
        12 11 22 25 64
        ===========
        11 12 22 25 64
        ===========
        Sorted array
        11 12 22 25 64

     */


    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 25, 12, 22, 11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

    private void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                printArray(arr);
            }
            System.out.println("===========");
        }

    }

    private void printArray(int[] arr) {
        for (int i1 : arr) {
            System.out.print(i1 + " ");
        }
        System.out.println();
    }


}
