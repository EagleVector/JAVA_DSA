package com.dsa;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7, 5, 2, 0};

        int ans = peakindex(arr);
        System.out.println(ans);
    }

    static int peakindex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                end = mid;

            }
        }
        return start;
    }
}
