package org.example.datastructure;

import java.util.HashSet;
import java.util.Set;

public class Q27_LoopChecker {
    public static void main(String[] args) {
        int[] arr = {2, -1, 1, 2, 2};
        System.out.println(checkLoop(arr));
    }

    private static boolean checkLoop(int[] arr) {
        int n = arr.length;
        Set<Integer> visited = new HashSet<>();
        int curr = 0;
        while(true) {
            if (visited.contains(curr))
                return true;
            if (arr[curr] == 0 || curr == (curr + arr[curr]) % n)
                return false;
            visited.add(curr);
            curr = (curr + arr[curr]) % n;
        }
    }
}
