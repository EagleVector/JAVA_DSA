package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the size of the array: ");
//        int size = input.nextInt();
        int[] arr = {12, 3, 4, 56, 154, 89, 120, 9};
        int target = 9;
//
//        System.out.println("Enter the array: ");
//        for (int i = 0; i < size; i++) {
//            arr[i] = input.nextInt();
//        }
//        System.out.print(Arrays.toString(arr));
//        System.out.print("Enter the number you wish to check: ");
//        int check = input.nextInt();
//
        int ans = search(arr, target);
        System.out.println(ans);

    }

    static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
