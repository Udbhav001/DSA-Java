package org.example.datastructure;

public class CW_Duplicates {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(findDuplicates(s));
    }

    private static int findDuplicates(String s) {
        int[] arr = new int[36];
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= '0' && c <= '9')
                arr[c - '0']++;
            else {
                if(c >= 'a' && c <= 'z')
                    arr[c - 'a' + 10]++;
                else
                    arr[c - 'A' + 10]++;
            }
        }
        int count = 0;
        for(int i = 0; i < 36; i++) {
            if(arr[i] > 1)
                count++;
        }
        return count;
    }
}
