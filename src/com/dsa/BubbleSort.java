package com.dsa;

import java.util.Arrays;

public class BubbleSort {
    // Bubble sort uses comparison method to sort the elements in any particular manner.
    // It is also known as sinking sort or exchange sort.
    // O(1) is the  space complexity of bubble sort. We don't create any new array space.
    // O(n^2) is the time complexity of bubble sort.
    // Bubble sort is a stable sorting algorithm.

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 4};

        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int[] arr) {
        boolean sorted;
        for (int i = 0; i < arr.length; i++) {
            // In case when the array is already sorted, we dont want to take the swaps into consideration.
            sorted = false;
            for (int j = 1; j <= arr.length - i - 1; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    sorted = true;
                }
            }
            if (sorted == false) {
                break;
            }
        }
    }
}
