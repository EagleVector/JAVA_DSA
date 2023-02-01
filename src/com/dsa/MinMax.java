package com.dsa;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {23, 54, 12, 789, 32, 89, 3, 78, 45678, 43, 12, 980};
        int max = maxim(arr);
        System.out.println("The maximum number in the array is: " + max);

        int min = minim(arr);
        System.out.println("The minimum number in the array is: " + min);
    }

    static int minim(int[] arr) {
        int minm = arr[0];
        for (int i =0; i < arr.length; i++) {
            if (arr[i] < minm) {
                minm = arr[i];
            }
        }
        return minm;
    }

    static int maxim(int[] arr) {
        int maxm = arr[0];
        for (int i =0; i < arr.length; i++) {
            if (arr[i] > maxm) {
                maxm = arr[i];
            }
        }
        return maxm;
    }
}
