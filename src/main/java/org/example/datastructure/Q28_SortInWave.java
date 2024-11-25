package org.example.datastructure;

import java.util.Arrays;

public class Q28_SortInWave {
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
        System.out.println(Arrays.toString(sortInWave(arr)));
    }

    private static int[] sortInWave(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i+=2) {
            if(i > 0 && arr[i - 1] > arr[i])
                swap(arr, i, i - 1);
            if(i < n - 1 && arr[i + 1] > arr[i])
                swap(arr, i, i + 1);
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
