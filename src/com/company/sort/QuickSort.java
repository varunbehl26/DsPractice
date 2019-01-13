package com.company.sort;

public class QuickSort {

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
        QuickSort ob = new QuickSort();
        int[] arr = {64, 25, 12, 22, 11};
        ob.sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

    /* This function takes last element as pivot,
           places the pivot element at its correct
           position in sorted array, and places all
           smaller (smaller than pivot) to left of
           pivot and all greater elements to right
           of pivot */
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        printArray(arr);
        System.out.println("===========");

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    private void sort(int[] arr, int low, int high) {

        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);
            System.out.println("pi " + pi);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    private void printArray(int[] arr) {
        for (int i1 : arr) {
            System.out.print(i1 + " ");
        }
        System.out.println();
    }


}
