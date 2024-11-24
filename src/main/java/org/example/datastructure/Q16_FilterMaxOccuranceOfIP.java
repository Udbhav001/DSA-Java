package org.example.datastructure;

import java.util.HashMap;
import java.util.Map;

public class Q16_FilterMaxOccuranceOfIP {
    public static void main(String[] args) {
        String[] arr = {
                "10.0.0.1 bytes=32 time=50ms TTL=63",
                "10.0.0.2 bytes=32 time=50ms TTL=73",
                "10.0.0.3 bytes=32 time=50ms TTL=83",
                "10.0.0.2 bytes=32 time=50ms TTL=93",
        };
        System.out.println(filterIP(arr));
    }

    private static String filterIP(String[] arr) {
        Map<String, Integer> map = new HashMap<>();
        for(String s: arr) {
            String extractedIP = extractIP(s);
            if(validIP(extractedIP))
                map.put(extractedIP, map.getOrDefault(extractedIP, 0) + 1);
        }
        String ans = null;
        int max = 0;
        for(String key: map.keySet()) {
            if(map.get(key) > max) {
                ans = key;
                max = map.get(key);
            }
        }
        return ans;
    }

    private static boolean validIP(String extractedIP) {
        String[] arr = extractedIP.split("\\.");
        for(String s: arr) {
            int n = Integer.parseInt(s);
            if(n < 0 || n > 255)
                return false;
        }
        return true;
    }

    private static String extractIP(String s) {
        return s.substring(0, s.indexOf(' '));
    }

}
