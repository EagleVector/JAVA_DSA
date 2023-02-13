package com.dsa;

public class Patterns {
    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(10);
//        pattern5mod(5);
//        pattern6(5);
//        pattern7(5);
//        pattern8(5);
        pattern8(5);
//    }
//    static void pattern1(int n) {
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println("---------------");
//    }
//    static void pattern2(int n) {
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println("---------------");
//    }
//    static void pattern3(int n) {
//        for (int row = 1; row <= n; row++) {
//            for (int col = n - row + 1; col >= 1; col--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println("-------------");
//    }
//    static void pattern4(int n) {
//        for (int row = 1; row <= n; row++) {
//            int count = 1;
//            for (int col = 1; col <= row; col++) {
//                System.out.print(count + " ");
//                count++;
//            }
//            System.out.println();
//        }
//    }
//    static void pattern5(int n) {
//        for (int row1 = 1; row1 <= n/2; row1++) {
//            for (int i = 1; i <= row1; i++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int row2 = n/2 + 1; row2 <= n; row2++) {
//            for (int j = n - row2; j > 0; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//    }


//    static void pattern5mod(int n) {
//        for (int row = 0; row < 2 * n; row++) {
//            int totalcols = row > n ? 2 * n - row : row;
//            for (int col = 0; col < totalcols; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//    static void pattern6(int n) {
//        for (int row = 1; row < 2 * n; row++) {
//            int totalcols = row > n ? 2 * n - row : row;
//
//            int totalspaces = n - totalcols;
//            for (int spaces = 0; spaces < totalspaces; spaces++) {
//                System.out.print(" ");
//            }
//            for (int col = 0; col < totalcols; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//    }


    }

    static void pattern8(int n) {
        int N = 2 * n;
        for (int row = 0; row <= N; row++) {
            for (int col = 0; col <= N; col++) {
                int atEveryIndex = n - Math.min(Math.min(row, col), Math.min(N - row, N - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
    }

//    static void pattern8(int n) {
//        for (int row = 1; row < 2 * n; row++) {
//            int totalspaces = row > n ? row - n : n - row;
//            for (int space = 0; space < totalspaces; space++) {
//                System.out.print("  ");
//            }
//
//            int c = row > n ? 2 * n - row : row;
//            for (int col = c; col >= 1; col--) {
//                System.out.print(col + " ");
//            }
//            for (int col = 2; col <= c; col++) {
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }

//    static void pattern7(int n) {
//
//        for (int row = 1; row <= n; row++) {
//
//            for (int space = 0; space < n - row; space++) {
//                System.out.print("  ");
//            }
//            for (int col = row; col >= 1; col--) {
//                System.out.print(col + " ");
//            }
//            for (int col = 2; col <= row; col++) {
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }
//    }

    }
}