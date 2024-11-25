package org.example.datastructure;

public class Q23_MaxPathSum {
    public static void main(String[] args) {
        int[][] arr = { { 10, 10, 2, 0, 20, 4 },
                { 1, 0, 0, 30, 2, 5 },
                { 0, 10, 4, 0, 2, 0 },
                { 1, 0, 2, 20, 0, 4 }
        };
        System.out.println(findMaxPathSum(arr));
    }

    private static int findMaxPathSum(int[][] mat) {
        int res = -1, N = mat.length, M = mat[0].length;
        for (int i = 1; i < N; i++) {
            res = -1;
            for (int j = 0; j < M; j++) {
                mat[i][j] += (j > 0 && j < M - 1)
                        ? Math.max(mat[i - 1][j], Math.max(mat[i - 1][j - 1], mat[i - 1][j + 1]))
                        : (j > 0) ? Math.max(mat[i - 1][j], mat[i - 1][j - 1])
                        : (j < M - 1) ? Math.max(mat[i - 1][j], mat[i - 1][j + 1]) : 0;
                res = Math.max(mat[i][j], res);
            }
        }
        return res;
    }
}
