package org.example.datastructure;

public class CW_HumanReadableTime {
    public static void main(String[] args) {
        int n = 12389;
        System.out.println(convertTime(n));
    }

    private static String convertTime(int n) {
        int hh = n / 3600;
        n = n % 3600;
        int mm = n / 60;
        n = n % 60;
        return hh + ":" + mm + ":" + n;
    }
}
