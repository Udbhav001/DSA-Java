package org.example.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Q17_AnagramStrings {
    public static void main(String[] args) {
        String[] arr = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
        String word = "abcd";
        System.out.println(findAnagramStrings(arr, word));
    }

    private static List<String> findAnagramStrings(String[] arr, String word) {
        int n = word.length();
            List<String> list = new ArrayList<>();
        int[] freq = new int[26];
        for(int i = 0; i < n; i++)
            freq[word.charAt(i) - 'a']++;
        for(String s: arr) {
            if(s.length() != n)
                continue;
            if(isAnagram(s, freq.clone()))
                list.add(s);
        }
        return list;
    }

    private static boolean isAnagram(String s, int[] freq) {
        for(int i = 0; i < s.length(); i++)
            freq[s.charAt(i) - 'a']--;
        for(int i = 0; i < 26; i++)
            if(freq[i] < 0)
                return false;
        return true;
    }
}
