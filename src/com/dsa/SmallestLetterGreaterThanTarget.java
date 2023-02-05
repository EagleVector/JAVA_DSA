package com.dsa;

import java.util.Scanner;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {

        char[] letters = {'c', 'f', 'j'};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your target: ");
        char target = 'l';

        char ans = greaterletter(letters, target);
        System.out.println(ans);

    }

    static char greaterletter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > letters[mid]) {
                start = mid + 1;
            }
            else if (target < letters[mid]) {
                end = mid-1;
            }
        }
        return letters[start % letters.length];
    }
}
