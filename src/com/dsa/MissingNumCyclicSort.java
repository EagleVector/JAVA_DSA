package com.dsa;

public class MissingNumCyclicSort {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        int ans = missingnumber(arr);
        System.out.println(ans);
    }

    static int missingnumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int index = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[index]){
                swapix(arr, i, index);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }

    static void swapix(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}