package com.dsa;

public class InfArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 7, 9, 12, 16, 19, 21, 25, 29, 32, 36, 41, 47, 53, 65, 67, 84, 91};
        int target = 32;
        int ans = window(arr, target);
        System.out.println(ans);
    }

    static int window(int[] arr, int target) {
        int start = 0;
        int end = 4;
        while (target > arr[end]) {
            int newstart = end + 1;
            end = end + ((end - start + 1) * 2);
            start = newstart;
        }
        return Binarysrch(arr, target, start, end);
    }

    static int Binarysrch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
