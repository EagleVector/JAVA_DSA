package com.dsa;

import java.util.Arrays;

public class BubbleSort {
    // Bubble sort uses comparison method to sort the elements in any particular manner. It is also known as sinking sort or exchange sort.
    // O(1) is the  space complexity of bubble sort.
    // O(n^2) is the time complexity of bubble sort.
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 5, 4, 1, 7};

        int[] ans = bubblesort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] bubblesort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
