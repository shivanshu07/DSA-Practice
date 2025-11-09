// import java.util.*;
/*
 Find the Nth term of an AP
 */

public class P7 {
    //Approach 1: Iterative method {O(n), O(1)}
    public static int getNthTerm1(int a1, int a2, int n)
    {
        int d = a2-a1;
        int nterm = a1;

        for(int i=1;i<n;i++)
        {
            nterm = nterm + d;
        }

        return nterm;
    }

    //Approach 2: Using the formula {O(1), O(1)}
    public static int getNthTerm2(int a1, int a2, int n)
    {
        return a1 + (n-1)*(a2-a1);
    }

    public static void main(String[] args) {
        System.out.println(getNthTerm1(2, 3, 4));
        System.out.println(getNthTerm2(2, 3, 4));
    }
}
