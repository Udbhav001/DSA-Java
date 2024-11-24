package org.example.datastructure;

public class CW_EqualSidesOfArray {
    public static void main(String[] args) {
        int[] arr = {20,10,-80,10,10,15,35};
        System.out.println(findEqualSide(arr));
    }

    private static int findEqualSide(int[] arr) {
        int n = arr.length;
        int[] pre = new int[n];
        int ans = -1;
        if(n == 0)
            return ans;
        pre[0] = arr[0];
        for(int i = 1; i < n; i++)
            pre[i] = pre[i - 1] + arr[i];
        int suff = arr[n - 1];
        for(int i = n - 2; i > -1; i--) {
            suff += arr[i];
            if(suff == pre[i])
                ans = i;
        }
        return ans;
    }
}
