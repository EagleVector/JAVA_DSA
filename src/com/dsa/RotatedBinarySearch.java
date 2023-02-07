package com.dsa;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 0, 1, 2, 3};
        int ans = pivotindex(arr);
        System.out.println(ans);
    }
    static int pivotindex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid-1]) {
                return mid;
            }
            else if (arr[start] <= arr[mid]) {
                start = mid + 1;
            }
            else if (arr[start] >= arr[mid]) {
                end = mid - 1;

            }
        }
        return -1;
    }
}
