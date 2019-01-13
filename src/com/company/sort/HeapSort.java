package com.company.sort;

public class HeapSort {

    /*
        Time complexity of heapify is O(Logn).
        Time complexity of createAndBuildHeap() is O(n)
        overall time complexity of Heap Sort is O(nLogn).

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
        HeapSort ob = new HeapSort();
        int arr[] = {64, 25, 12, 22, 11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

    public void sort(int[] arr) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
            printArray(arr);
            System.out.println("===========");
        }
    }

    private void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    private void printArray(int[] arr) {
        for (int i1 : arr) {
            System.out.print(i1 + " ");
        }
        System.out.println();
    }


}
