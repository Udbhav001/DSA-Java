package org.example.datastructure;

public class Q11_RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1};
        System.out.println(findMinimum(arr));
    }

    private static int findMinimum(int[] arr) {
        int l = 0, r = arr.length - 1;
        while(l < r) {
            if(arr[l] <= arr[r])
                return arr[l];
            int mid = (l + r) / 2;
            if(arr[mid] > arr[r])
                l = mid + 1;
            else
                r = mid;
        }
        return arr[l];
    }
}
