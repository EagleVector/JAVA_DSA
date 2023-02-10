package com.dsa;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        int[] ans = mismatch(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mismatch(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swaptheidx(arr, i, correct);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return new int[] {j, j + 1};
            }
        }
        return new int[] {-1, -1};
    }

    static void swaptheidx(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
