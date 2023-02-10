package com.dsa;

public class Minpos {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int ans = cyclesorting(arr);
        System.out.println(ans);
    }

    static int cyclesorting(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swapingidx(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int num = 0; num < arr.length; num++) {
            if (arr[num] != num + 1) {
                return num + 1;
            }
        }
        return arr.length + 1;
    }

    static void swapingidx(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
