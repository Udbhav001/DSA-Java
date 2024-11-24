package org.example.datastructure;

public class Q8_FirstNonRepeating {
    public static void main(String[] args) {
        String s = "abbacd";
        System.out.println(findFirstNonRepeating(s));
    }

    private static char findFirstNonRepeating(String s) {
        int[] arr = new int[126];
        for(int i = 0; i < s.length(); i++)
            arr[s.charAt(i)]++;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(arr[c] == 1)
                return c;
        }
        return (char)1;
    }
}
