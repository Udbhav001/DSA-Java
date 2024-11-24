package org.example.datastructure;

public class Q14_PowerOfTen {
    public static void main(String[] args) {
        int n = 10000;
        System.out.println(checkPowerOfTen(n));
    }

    private static boolean checkPowerOfTen(int n) {
        int zero = 0, one = 0, all = 0;
        while(n > 0) {
            int rem = n % 10;
            if(rem == 0)
                zero++;
            else if(rem == 1)
                one++;
            all++;
            n = n / 10;
        }
        return one == 1 && zero == all - 1;
    }
}
