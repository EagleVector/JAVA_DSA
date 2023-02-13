package com.dsa;

import java.util.Arrays;

public class Live {
    public static void main(String[] args) {
//        StringBuffer name = new StringBuffer("Raju");
//        StringBuffer anothername = name.append("Saan");
//        System.out.println(name);
//        System.out.println(anothername);
//        int a = 10;
//        int b = 20;

//        System.out.println((a+b) + " " + (a*b) + " " + (a/b) + " " + (a-b) + " " + (a%b));
//        System.out.println(a>b);
//        String s1 = "Raju";
//        s1 += "Saan";
//
//        System.out.println(s1);
//        int[] marks = new int[4];
//        marks[3] = 40;
//        marks[0] = 10;
//        marks[1] = 12;
//        System.out.println(marks[3]);
//        int[] age = {11, 13, 24, 34, 12};
//        System.out.println(Arrays.toString(age));
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[4]);
//        for (int i = 0; i < marks.length; i++) {
//            System.out.println(marks[i]);
//        }
//        int[] rupees = {2, -9, 0, 5, 12, -25};
//        int sum = 0;
//        for (int i = 0; i < rupees.length; i++) {
//            sum = sum + rupees[i];
//        }
//        System.out.println("Total sum: " + sum);

//        int[] arr = {15, 2, 10, 3, 9};
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println("Maximum number: " + max);
        int[] originalarr = {1, 2, 3, 4, 5};
        int[] arr = {1, 2, 3, 4, 5};
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}