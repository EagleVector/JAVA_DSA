package com.dsa;

public class Evendigcount {
    public static void main(String[] args) {

        int[] arr = {12, 2, 3, 564, 4323, 987, 23456, 8905, 76890, 321, 23, 76, 8790, 321, 5};
        int evencount = even(arr);
        System.out.println(evencount);
    }

    static int even(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            while(arr[i] > 0) {
                arr[i] = arr[i]/10;
                count = count + 1;
            }
            if (count % 2 == 0) {
                ans = ans + 1;
            }
        }
        return ans;
    }
}
