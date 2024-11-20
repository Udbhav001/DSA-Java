package org.example.datastructure;

public class Q1_StringEncoding {
    public static void main(String[] args) {
        String s = "aabbbasdssdddds"; // output: a2b3a1s1d1s2d4s1
        System.out.println(encodeString(s));
    }

    private static String encodeString(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 1;
        char c = '\0';
        for(int i = 1; i < s.length(); i++) {
            c = s.charAt(i);
            char d = s.charAt(i - 1);
            if(c == d)
                count++;
            else {
                ans.append(d).append(count);
                count = 1;
            }
        }
        return !s.isEmpty() ? ans.append(c).append(count).toString() : null;
    }
}
