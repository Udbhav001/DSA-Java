package org.example.datastructure;

public class Q21_AddFraction {
    public static void main(String[] args) {
        int n1=1, d1=3, n2=3, d2=9;
        findSumOfFraction(n1, d1, n2, d2);
    }

    static void findSumOfFraction(int n1, int d1, int n2, int d2)
    {
        int d3 = gcd(d1, d2);
        d3 = (d1 * d2) / d3;
        int n3 = n1 * (d3 / d1) + n2 * (d3 / d2);
        getMin(d3,n3);
    }
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b%a, a);
    }

    static void getMin(int d3, int n3)
    {
        int cf = gcd(n3,d3);
        d3 = d3 / cf;
        n3 = n3 / cf;
        System.out.println("Numerator_ans : " + n3 + " Denominator_ans : " + d3);
    }
}
