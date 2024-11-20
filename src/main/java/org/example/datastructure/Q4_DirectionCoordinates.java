package org.example.datastructure;

public class Q4_DirectionCoordinates {
    public static void main(String[] args) {
        //String str = "URRDDL"; //output: (1, -1)
        String str = "DOWN UP 2xRIGHT DOWN 3xLEFT"; //output: (-1, -1)
        str = evaluateString(str);
        Pair ans = getCoordinates(str);
        System.out.println("(" + ans.first + ", " + ans.second + ")");
    }

    private static String evaluateString(String str) {
        StringBuilder sb = new StringBuilder();
        String[] arr = str.split(" ");
        if(arr.length == 1)
            return str;
        for(String s: arr) {
            char c = s.charAt(0);
            if(c >= '0' && c <= '9')
                sb.append(String.valueOf(s.charAt(2)).repeat(c - '0'));
            else
                sb.append(s.charAt(0));
        }
        return sb.toString();
    }

    private static Pair getCoordinates(String str) {
        int x = 0, y = 0;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'U' || c == 'u')
                y++;
            else if(c == 'D' || c == 'd')
                y--;
            else if(c == 'L' || c == 'l')
                x--;
            else
                x++;
        }
        return new Pair(x, y);
    }
}
class Pair {
    int first;
    int second;
    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
