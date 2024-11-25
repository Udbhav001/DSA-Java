package org.example.datastructure;

public class Q29_PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        generatePascalTriangle(n);
    }

    private static void generatePascalTriangle(int n) {
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                arr[i][j] = i == j || j == 0 ? 1 : arr[i - 1][j - 1] + arr[i - 1][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
