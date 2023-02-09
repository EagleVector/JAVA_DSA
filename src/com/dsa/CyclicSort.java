package com.dsa;

import java.util.Arrays;

public class CyclicSort {
    // Whenever the question defines range 1 to N ---> Use Cyclic Sort.
    // Space Complexity: O(1) No auxillary extra space required.
    // Time Complexity: O(N)
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycle(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int index = arr[i] - 1;
            if (index != i) {
                swapindx(arr, i, index);
            } else {
                i++;
            }
        }
    }

    static int[] swapindx(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return arr;
    }
}
