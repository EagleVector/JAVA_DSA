package com.dsa;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr2D = {
                {1, 2, 3},
                {3, 2, 1, 9, 8},
                {5, 6},
                {5},
                {0}
        };

        int ans = richer(arr2D);
        System.out.println(ans);
    }

    // Brute-Force Technique. Very general idea.
    static int richer(int[][] arr2D) {
        int sum = 0;
        for (int i = 0; i < arr2D.length; i++) {
            int total = 0;
            for (int j = 0; j < arr2D[i].length; j++) {
                total = total + arr2D[i][j];
            }
            if (total > sum) {
                sum = total;
            }
        }
        return sum;
    }
}
