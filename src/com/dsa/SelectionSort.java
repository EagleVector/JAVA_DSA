package com.dsa;

import java.util.Arrays;

public class SelectionSort {
    // Selection sort algorithm selects the maxm or minm element from the array and fits it to the right place.
    // Time complexity is O(n^2) in every case.
    // It is not a stable algorithm.
    // Works best for small arrays/lists.

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // finding the maximum element and then swapping.
            int last = arr.length - i - 1;
            int maxindex = getmaxindex(arr, 0, last);
            int[] swap = swapindex(arr, maxindex, last);
        }
    }

    static int[] swapindex(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return arr;
    }

    static int getmaxindex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[i] >= arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
