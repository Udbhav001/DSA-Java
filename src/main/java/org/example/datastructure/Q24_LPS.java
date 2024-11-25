package org.example.datastructure;

public class Q24_LPS {
    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        System.out.println(findLPS(s));
    }

    private static String findLPS(String s) {
        int n = s.length();
        int max = 1, ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 2; j++) {
                int l = i;
                int r = i + j;
                while(l > -1 && r < n && s.charAt(l) == s.charAt(r)) {
                    int c = r - l + 1;
                    if(c  > max) {
                        ans = l;
                        max = c;
                    }
                    l--;
                    r++;
                }
            }
        }
        return s.substring(ans, ans + max);
    }
}
