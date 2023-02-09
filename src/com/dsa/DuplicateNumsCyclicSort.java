package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumsCyclicSort {
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> answer = duplicatenums(arr);
        System.out.println(answer);
    }

    static List<Integer> duplicatenums(int[] arr) {
//        int i = 0;
//        while (i < arr.length) {
//
//            if (arr[i] != i + 1) {
//                int correct = arr[i] - 1;
//                if (arr[i] != arr[correct]) {
//                    swapindexs(arr, i, correct);
//                } else {
//                    return arr[i];
//                }
//            } else {
//                i++;
//            }
//        }
//        return -1;
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swapindexs(arr, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(arr[j]);
            }
        }
        return ans;
    }
    static void swapindexs(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
