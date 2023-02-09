package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumCyclicSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> answer = missingnumbers(arr);
        System.out.println(answer);
    }

    static List<Integer> missingnumbers(int[] arr) {
//        int i = 0;
//        while (i < arr.length) {
//            int index = arr[i];
//            if (arr[i] < arr.length && arr[i] != arr[index]){
//                swapix(arr, i, index);
//            } else {
//                i++;
//            }
//        }
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[j] != j) {
//                return j;
//            }
//        }
//        return arr.length;
        int i = 0;
        while (i < arr.length) {
            int index = arr[i] - 1;
            if (arr[i] != arr[index]) {
                swapix(arr, i, index);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(j + 1);
            }
        }
        return ans;
    }

    static void swapix(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}