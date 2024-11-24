package org.example.datastructure;

import java.util.HashMap;

public class Q15_AverageMarks {
    public static void main(String[] args) {
        String[][] arr = {{"Charles", "84"}, {"John", "100"}, {"Andy", "37"}, {"John", "23"}, {"Charles", "20"}};
        Object[] ans = getAverage(arr);
        System.out.println("Name : " + ans[0] + "\nAverage Marks : " + ans[1]);
    }

    private static Object[] getAverage(String[][] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        int maxMarks = 0;
        String name = "";
        for(String[] ar: arr) {
            map.put(ar[0], map.getOrDefault(ar[0], 0) + Integer.parseInt(ar[1]));
            if(maxMarks < map.get(ar[0])) {
                maxMarks = map.get(ar[0]);
                name = ar[0];
            }
        }
        float c = 0;
        for(String[] ar: arr) {
            if(ar[0].equals(name))
                c++;
        }
        return new Object[]{name, maxMarks / c};
    }
}
