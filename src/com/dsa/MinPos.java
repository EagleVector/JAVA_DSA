package com.dsa;

public class MinPos {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -1};
        int ans = cyclesortng(arr);
        System.out.println(ans);
    }

    static int cyclesortng(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > 0) {
                int correct = arr[i] - 1;
                if (arr[i] > 0 && arr[i] != arr[correct]) {
                    swapingidx(arr, i, correct);
                }
                else {
                    i++;
                }
            } else {
                i++;
            }
        }
        for (int num = 0; num < arr.length; num++) {
            if (arr[num] != num + 1) {
                return num + 1;
            }
        }
        return arr.length;
    }

    static void swapingidx(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
