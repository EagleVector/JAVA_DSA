package com.dsa;

public class SearchMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7, 5, 2, 0};
        int target = 3;
        int ans = searchidx(arr, target);
        System.out.println(ans);
    }

    static int searchidx(int[] arr, int target) {
        int peak = findpeak(arr);
        int firstTry = searchinmountainarray(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return searchinmountainarray(arr, target, peak+1, arr.length-1);
    }

    static int findpeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            }
            else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return start;
    }

    static int searchinmountainarray(int [] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid -1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid -1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}