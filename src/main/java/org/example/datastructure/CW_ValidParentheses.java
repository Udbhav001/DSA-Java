package org.example.datastructure;

public class CW_ValidParentheses {
    public static void main(String[] args) {
        String s = ")(";
        System.out.println(validParenthesis(s));
    }

    private static boolean validParenthesis(String s) {
        int x = 0;
        for(int i = 0; i < s.length(); i++) {
            x = s.charAt(i) == '(' ? x + 1 : x - 1;
            if(x < 0)
                return false;
        }
        return x == 0;
    }
}
