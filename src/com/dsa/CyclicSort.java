package com.dsa;

import java.util.Arrays;

public class CyclicSort {
    // Whenever the question defines range 1 to N ---> Use Cyclic Sort.
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        int[] ans = cycle(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] cycle(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int index = arr[i] - 1;
            if (index != i) {
                swapindx(arr, i, index);
            } else {
                i++;
            }
        }
        return arr;
    }

    static int[] swapindx(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return arr;
    }
}
