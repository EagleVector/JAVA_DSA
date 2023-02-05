package com.dsa;

import java.util.Scanner;

public class Flooring {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 12, 23, 31, 45, 67, 71, 79, 93};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the target element: ");
        int target = input.nextInt();

        int ans = floorop(arr, target);
        System.out.println(ans);
    }

    static int floorop(int[] arr, int target) {

        if (target < arr[0]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid -1;
            } else if (target == arr[mid]) {
                return mid;

            }
        }
        return end;
    }
}
