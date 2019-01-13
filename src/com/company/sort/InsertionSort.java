package com.company.sort;

public class InsertionSort {

    /*
        64, 25, 12, 22, 11
        ===========
        25 64 12 22 11
        ===========
        12 25 64 22 11
        ===========
        12 22 25 64 11
        ===========
        11 12 22 25 64
        ===========
        Sorted array
        11 12 22 25 64

     */


    public static void main(String[] args) {
        InsertionSort ob = new InsertionSort();
        int arr[] = {64, 25, 12, 22, 11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

    private void sort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            printArray(arr);
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
