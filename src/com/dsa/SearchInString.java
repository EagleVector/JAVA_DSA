package com.dsa;

public class SearchInString {
    public static void main(String[] args) {
        String[] arr = {"cherry", "sunny", "kelly", "tim", "bunny", "ronny", "dolly"};
        String target = "timmy";

        boolean ans = searchstring(arr, target);
        System.out.println(ans);
    }

    static boolean searchstring(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return  true;
            }
        }
        return false;
    }
}
