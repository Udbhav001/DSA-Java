package org.example.datastructure;

public class Q10_ConvertToInteger {
    public static void main(String[] args) {
        String s = "-123";
        System.out.println(convertInt(s));
    }

    private static int convertInt(String s) {
        int n = s.length();
        if(n == 0)
            return -1;
        boolean isNegative = false;
        if(s.charAt(0) == '-') {
            isNegative = true;
            s = s.substring(1);
            n--;
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(c >= '0' && c <= '9') {
                int x = c - '0';
                ans = ans * 10 + x;
            }
            else
                return -1;
        }
        return isNegative ? -ans : ans;
    }
}
