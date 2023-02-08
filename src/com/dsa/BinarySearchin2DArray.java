package com.dsa;

import java.util.Arrays;

public class BinarySearchin2DArray {
    public static void main(String[] args) {
        int[][] arr2D = {
                {10, 20, 30, 40, 46},
                {12, 21, 34, 45, 47},
                {48, 50, 54, 61, 65},
                {72, 75, 81, 88, 92}
        };
        int target = 92;
        int[] ans = searchin2D(arr2D, target);
        System.out.println(Arrays.toString(ans));
    }

//    static int[] searchin2D(int[][] arr2D, int target) {
//        for (int row = 0; row < arr2D.length; row++) {
//            for (int col = 0; col < arr2D[row].length; col++) {
//                if (target == arr2D[row][col]) {
//                    return new int[]{row, col};
//                }
//            }
//        }
//        return new int[]{-1, -1};
//    }
    static int[] searchin2D(int[][] arr2D, int target) {
        int row = 0;
        int col = arr2D[0].length - 1;

        while (row < arr2D.length && col >= 0) {
            if (target == arr2D[row][col]) {
                return new int[]{row, col};
            }
            else if (target > arr2D[row][col]) {
                row++;

            }
            else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
