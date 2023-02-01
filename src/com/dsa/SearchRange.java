package com.dsa;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class SearchRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String name = "Cherry";
//        char target = 'i';
//        boolean ans = charcheck(name, target);
//        System.out.println(ans);
        int[] arr = {12, 34, 21, 87, 456, 324, 26};
        System.out.print("Enter target: ");
        int target = input.nextInt();

        System.out.print("Enter start index range: ");
        int start = input.nextInt();

        System.out.print("Enter end index range: ");
        int end = input.nextInt();

        boolean ans = intcheck(arr, target, start, end);
        System.out.println(ans);

    }

    static boolean intcheck(int[] arr, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

//    static boolean charcheck(String name, char target) {
//        for (int i = 0; i < name.length(); i++) {
//            if (target == name.charAt(i)) {
//                return true;
//            }
//        }
//        return false;
//    }
}