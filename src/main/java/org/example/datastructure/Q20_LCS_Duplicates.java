package org.example.datastructure;

public class Q20_LCS_Duplicates {
    public static void main(String[] args) {
        String s = "aabbCCCddddd";
        Object[] ans = getLCS(s);
        System.out.println(ans[0] + " " + ans[1]);
    }

    private static Object[] getLCS(String s) {
        int n = s.length();
        char pre = s.charAt(0), c;
        int count = 1;
        String ans = null;
        int start = 0, ans_start = 0;
        int max = 0;
        for(int i = 1; i < n; i++) {
            c = s.charAt(i);
            if(pre == c)
                count++;
            else {
                if(count > max) {
                    max = count;
                    ans = s.substring(start, i);
                    ans_start = start;
                }
                start = i;
                count = 1;
            }
            pre = c;
        }
        if(max < count) {
            ans = s.substring(start, n);
            ans_start = start;
        }
        return new Object[]{ans_start, ans};
    }
}
