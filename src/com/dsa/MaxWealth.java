package com.dsa;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr2D = {
                {1,2,3,78},
                {3,2,1,9}
        };

        int ans = richer(arr2D);
        System.out.println(ans);
    }

    // Brute-Force Technique. Very general idea.
    static int richer(int[][] arr2D) {
        int wealth1 = 0;
        int wealth2 = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                wealth1 = wealth1 + arr2D[i][j];
            }
        }
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                wealth2 = wealth2 + arr2D[i][j];
            }
        }

        if (wealth1 > wealth2) {
            return wealth1;
        }

        return wealth2;
    }
}
