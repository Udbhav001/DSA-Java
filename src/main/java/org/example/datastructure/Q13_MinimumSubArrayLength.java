package org.example.datastructure;

public class Q13_MinimumSubArrayLength {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10, 2, 1};
        int k = 12;
        System.out.println(findMinimumSubArray(arr, k));
    }

    private static int findMinimumSubArray(int[] arr, int k) {
        int l = 0, r = 0;
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        while(r < n) {
            sum += arr[r];
            while(sum > k)
                sum -= arr[l++];
            if(sum == k) {
                if(min > (r - l + 1))
                    min = r - l + 1;
            }
            r++;
        }
        return min;
    }
}
