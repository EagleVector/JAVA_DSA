package com.dsa;

import java.util.Arrays;
import java.util.Scanner;


public class Ceiling {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 4, 7, 11, 15, 19, 23, 29, 35, 43, 71, 84, 97};

        System.out.print("Enter the target element: ");
        int target = input.nextInt();

        int ans = ceilng(arr, target);
        System.out.println(ans);
    }

    static int ceilng(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
                int i = mid;
                while(i <= end) {
                    if (arr[i] > target) {
                        break;
                    }
                    i++;
                }
                return arr[i];
            }

            else if (target < arr[mid]) {
                end = mid - 1;
                int j = 0;
                while(j <= mid) {
                    if (arr[j] > target) {
                        break;
                    }
                    j++;
                }
                return arr[j];
            }
            else if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
}