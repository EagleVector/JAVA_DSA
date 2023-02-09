package com.dsa;

public class DuplicateElements {
    // Return the duplicate element in the array.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1};
        int ans = duplicate(arr);
        System.out.println(ans);
    }

    static int duplicate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
