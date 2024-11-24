package org.example.datastructure;

public class Q18_MissingInteger {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        System.out.println(findMissingInteger(arr));
    }

    private static int findMissingInteger(int[] arr) {
        int sum = 0;
        boolean flag = false;
        for(int i: arr) {
            if(i == 0)
                flag = true;
            sum += i;
        }
        int n = arr.length;
        if(flag)
            n--;
        int totalSum = (n * (n + 1)) / 2;
        int ans = totalSum - sum;
        return flag && ans == 0 ? -1 : ans;
    }
}
