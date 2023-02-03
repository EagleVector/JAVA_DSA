package com.dsa;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {12, 32, 35, 78, 87, 90, 93, 98, 105, 567};
        System.out.print("Enter the target: ");
        int target = input.nextInt();
        int ans = Binarysrch(arr, target);
        System.out.println(ans);


    }

    static int Binarysrch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            }else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
