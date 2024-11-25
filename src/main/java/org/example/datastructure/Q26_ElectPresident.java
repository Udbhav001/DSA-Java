package org.example.datastructure;

public class Q26_ElectPresident {
    public static void main(String[] args) {
        int n = 4, k = 2;
        System.out.println(elect(n, k));
    }

    private static int elect(int n, int k) {
        return n == 1 ? 1 : (elect(n - 1, k) + k - 1) % n + 1;
    }
}
