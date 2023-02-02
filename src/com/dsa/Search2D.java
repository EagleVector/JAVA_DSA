package com.dsa;

public class Search2D {
    public static void main(String[] args) {
        int[][] arr2D = {
                {12, 43, 678},
                {1, 3, 89, 456, 90, 21},
                {32, 14}
        };
        int target = 320;

        boolean ans = searchin2D(arr2D, target);
        System.out.println(ans);
    }

    static boolean searchin2D(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
