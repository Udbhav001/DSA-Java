package org.example.datastructure;

public class Q2_LongestString {
    public static void main(String[] args) {
        String[] arr = {"CODGE", "oDg", "LODgE", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String s = "oDg"; // output: LODGESSSS
        System.out.println(findLongestString(arr, s));
    }

    private static String findLongestString(String[] arr, String s) {
        int maxLength = 0;
        String word = null;
        if(s.isEmpty())
            return null;
        for(String str: arr) {
            int len = str.length();
            if(maxLength < len && compareString(str, s)) {
                maxLength = len;
                word = str;
            }
        }
        return word;
    }

    private static boolean compareString(String str, String s) {
        int pos = 0;
        int n = s.length();
        int d = s.charAt(pos++);
        for(int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);
            if(c == d || c + 32 == d || d + 32 == c) {
                if(pos == n)
                    return true;
                d = s.charAt(pos++);
            }
            else {
                d = s.charAt(0);
                pos = 1;
            }
        }
        return false;
    }
}
