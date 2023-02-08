package com.dsa;

import java.util.Arrays;

public class InsertionSort {

    // Time Complexity: O(n^2)
    // Space Complexity: O(1) No auxillary space required.
    // Insertion sort is the method implemented in some of internal hybrid sorting algorithms.
    // Works best when array or part of the array is sorted.
    // Stable algorithm: Maintains the order while sorting.
    // best case: O(N - 1) when the array is sorted.

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 1, 2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swapidx(arr, j , j-1);
                } else {
                    break;
                }
            }
        }
    }

    static int[] swapidx(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return arr;
    }
}
