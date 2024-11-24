package org.example.datastructure;

public class Q9_MinDistanceBetweenWords {
    public static void main(String[] args) {
        String str = "the quick the brown quick brown the frog";
        String w1 = "brown";
        String w2 = "frog";
        System.out.println(findMinDistance(str, w1, w2));
    }

    private static int findMinDistance(String str, String w1, String w2) {
        String[] arr = str.split(" ");
        int min = Integer.MAX_VALUE;
        int i1 = -1, i2 = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(w1))
                i1 = i;
            if (arr[i].equals(w2))
                i2 = i;
            if(i1 != -1 && i2 != -1) {
                int diff = Math.abs(i1 - i2);
                if (diff < min)
                    min = diff - 1;
            }
        }
        return min;
    }
}
