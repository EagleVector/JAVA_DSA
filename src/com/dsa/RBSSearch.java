package com.dsa;

public class RBSSearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9, 0, 1, 2, 3};
        int target = 6;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        int pivot = pivotindex(arr);

        if (pivot == -1) {
            return binarysearch(arr, target, 0, arr.length-1);
        }

        else if (target == arr[pivot]) {
            return pivot;
        }

        else if (target < arr[0]) {
            return binarysearch(arr, target, pivot - 1, arr.length-1);
        }
        else {
            return binarysearch(arr, target, 0, pivot - 1);
        }
    }

    static int binarysearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start)/2;

            if (target == arr[mid]) {
                return mid;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
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
