package org.example.datastructure;

public class Q5_Median {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 8}, arr2 = {10, 12, 14, 16, 18, 20}; //output: 11.0
        System.out.println(findMedian(arr1, arr2));
    }

    private static double findMedian(int[] arr1, int[] arr2) {
        int mid1 = 0, mid2 = 0, n = arr1.length, m = arr2.length, pos1 = 0, pos2 = 0;
        for(int i = 0; i <= (n+m)/ 2; i++) {
            mid1 = mid2;
            if(pos1 < n && pos2 < m)
                mid2 = arr1[pos1] > arr2[pos2] ? arr2[pos2++] : arr1[pos1++];
            else if(pos1 < n)
                mid2 = arr1[pos1++];
            else
                mid2 = arr2[pos2++];
        }
        return (n + m) % 2 == 0 ? (mid1 + mid2) / 2.0 : mid2;
    }
}
