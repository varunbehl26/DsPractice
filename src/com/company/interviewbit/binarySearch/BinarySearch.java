package com.company.interviewbit.binarySearch;

public class BinarySearch {

    static int binarySearch(int[] arr, int start, int end, int key) {
        if (start == end) {
            return -1;
        }

        int mid = (start + end) / 2;
        if (arr[mid] < key) {
            return binarySearch(arr, mid + 1, end, key);
        } else if (arr[mid] > key) {
            return binarySearch(arr, start, mid, key);
        } else {
            return mid;
        }
    }


    static int countOccurrences(int arr[],
                                int n, int x) {
        int ind = binarySearch(arr, 0, n - 1, x);

        // If element is not present
        if (ind == -1)
            return 0;

        // Count elements on left side.
        int count = 1;
        int left = ind - 1;
        while (left >= 0 &&
                arr[left] == x) {
            count++;
            left--;
        }

        // Count elements
        // on right side.
        int right = ind + 1;
        while (right < n &&
                arr[right] == x) {
            count++;
            right++;
        }

        return count;
    }

    public static int findCount(final int[] A, int B) {
        int index = binarySearch(A, 0, A.length - 2, B);

        if (index == -1) {
            return 0;
        }

        int count = 1;
        int left = index - 1;
        while (left >= 0 && A[left] == B) {
            count++;
            left--;
        }
        int right = index + 1;
        while (right < A.length && A[right] == B) {
            count++;
            right--;
        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        System.out.println(findCount(arr, 2));
    }
}
