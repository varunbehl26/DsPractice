package com.company.sort;

//Sorting mechanism which look for the smallest and sort with the first and then with the second

public class SelectionSort {
    /*
        64 25 12 22 11
        ===========
        11 25 12 22 64
        ===========
        11 12 25 22 64
        ===========
        11 12 22 25 64
        ===========
        Sorted array
        11 12 22 25 64

        Time Complexity: O(n2) as there are two nested loops.
        Auxiliary Space: O(1)
     */


    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64, 25, 12, 22, 11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

    void sort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            printArray(arr);
            System.out.println("===========");
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }


    private void printArray(int[] arr) {
        for (int i1 : arr) {
            System.out.print(i1 + " ");
        }
        System.out.println();
    }


}
