package org.example.datastructure;

public class Q33_TrappedRainWater {
    public static void main(String[] args) {
        int[] arr = {3, 0, 2, 0, 4};
        System.out.println(findTotalTrappedWater(arr));
    }

    private static int findTotalTrappedWater(int[] arr) {
        int n = arr.length;
        int[] pre = new int[n];
        pre[0] = arr[0];
        for(int i = 1; i < n; i++)
            pre[i] = Math.max(pre[i - 1], arr[i]);

        int[] suf = new int[n];
        suf[n - 1] = arr[n - 1];
        for(int i = n - 2; i > -1; i--)
            suf[i] = Math.max(suf[i + 1], arr[i]);

        int sum = 0;
        for(int i = 0; i < n; i++)
            sum += Math.min(pre[i], suf[i]) - arr[i];

        return sum;
    }
}
