package com.dsa;

public class Palin {
    public static void main(String[] args) {
//        int a = 10;
//        String name = "Cherry";
//        String posn = "Full Stack Developer";
//        System.out.println(name);
//        System.out.println(a);
//        System.out.println(nkname);
//        name = "Sunny";
//        System.out.println(name);
//        System.out.println(nkname);
//        System.out.println(11 + "5");
//        System.out.printf("My name is %s and I am a %s.", name, posn);
        String str = "abcdcba";
        boolean result = ispalindrome(str);
        System.out.println(result);
    }

    static boolean ispalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        for (int i = 0; i <= str.length() / 2; i++) {
            int start = i;
            int end = str.length() - i - 1;
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
        }
        return true;
    }
}
