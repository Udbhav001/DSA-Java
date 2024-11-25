package org.example.datastructure;

public class Q22_StaircaseWays {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(getNumberOfWays(n));
    }

    private static int getNumberOfWays(int n) {
        int a = 1, b = 1;
        for(int i = 2; i <= n; i++) {
            int c = a + b;
            b = a;
            a = c;
        }
        return a;
    }
}
