package com.dsa;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {342, 123, 112, 109, 89, 78, 48, 38, 27, 19, 14, 12, 3};
        System.out.print("Enter the target: ");
        int target = input.nextInt();
        int ans = Binarysrch(arr, target);
        System.out.println(ans);


    }

    static int Binarysrch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] < arr[end]) {
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
        } else if (arr[start] > arr[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}


//        while(start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target > arr[mid]) {
//                start = mid + 1;
//            }else if (target < arr[mid]) {
//                end = mid - 1;
//            }
//            else {
//                return mid;
//            }
//        }
//        while(start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target < arr[mid]) {
//                start = mid + 1;
//            }else if (target > arr[mid]) {
//                end = mid - 1;
//            }
//            else {
//                return mid;
//            }
//        }
//        return -1;
//    }
//}
