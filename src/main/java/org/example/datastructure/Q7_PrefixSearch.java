package org.example.datastructure;

import java.util.ArrayList;
import java.util.List;


public class Q7_PrefixSearch {
    public static void main(String[] args) {
        String[] arr = {"apple", "applet", "bread", "aper"};
        String prefix = "app";
        System.out.println(searchPrefix(arr, prefix));
    }

    private static List<String> searchPrefix(String[] arr, String prefix) {
        List<String> list = new ArrayList<>();
        for(String s: arr) {
            if(compareString(s, prefix))
                list.add(s);
        }
        return list;
    }

    private static boolean compareString(String s, String prefix) {
        int n = s.length();
        int m = prefix.length();
        if(n < m)
            return false;
        for(int i = 0; i < m; i++) {
            if(prefix.charAt(i) != s.charAt(i))
                return false;
        }
        return true;
    }
}
