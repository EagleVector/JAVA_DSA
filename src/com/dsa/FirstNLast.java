package com.dsa;

public class FirstNLast {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 5, 7, 9, 11, 13, 13, 17, 17, 17, 17, 17};
        int target = 17;

        firstlastidx(arr, target);

//  Brute-Force
//        firstindex(arr, target);
//        lastindex(arr, target);
    }

    static void firstlastidx(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (start + end) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
                for (int i = start; i <= end; i++) {
                    if (arr[i] == target) {
                        System.out.println(i);
                        break;
                    }
                }
                for (int j = end; j >= start; j--) {
                    if (arr[j] == target) {
                        System.out.println(j);
                        break;
                    }
                }
            }
            else if (target < arr[mid]) {
                end = mid - 1;
                for (int i = 0; i <= end; i++) {
                    if (arr[i] == target) {
                        System.out.println(i);
                        break;
                    }
                }
                for (int j = end; j >= 0; j--) {
                    if (arr[j] == target) {
                        System.out.println(j);
                        break;
                    }
                }

            }
        }
    }
}

//    static void lastindex(int[] arr, int target) {
//        int arrlen = arr.length - 1;
//        for (int i = arrlen; i >= 0; i--) {
//            if (arr[i] == target) {
//                System.out.println("Last Index of the number: " + i);
//                break;
//            }
//        }
//    }
//
//    static void firstindex(int[] arr, int target) {
//        int arrlen = arr.length - 1;
//        for (int i = 0; i < arrlen; i++) {
//            if (arr[i] == target) {
//                System.out.println("First Index of the number: " + i);
//                break;
//            }
//        }
//    }
//}
