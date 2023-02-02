package com.dsa;

public class Search2D {
    public static void main(String[] args) {
        int[][] arr2D = {
                {12, 43, 678},
                {1, 3, 89, 456, 90, 21},
                {32, 14}
        };
//        int target = 320;

        int ans = minimum(arr2D);
        System.out.println(ans);

        int answer = maximum(arr2D);
        System.out.println(answer);
    }

    static int minimum(int[][] arr2D) {
        int min = arr2D[0][0];
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                if (arr2D[row][col] < min) {
                    min = arr2D[row][col];
                }
            }
        }
        return min;
    }

    static int maximum(int[][] arr2D) {
        int max = arr2D[0][0];
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                if (arr2D[row][col] > max) {
                    max = arr2D[row][col];
                }
            }
        }
        return max;
    }

//    static boolean searchin2D(int[][] arr, int target) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] == target) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
}
