import java.util.Arrays;
/*
 Find the fibonacci number at position n
 */
public class P18 {
    //Approach 1: Recursion {O(2^n), O(n)}
    public static int fibo1(int n)
    {
        if(n==0)
        {
            return 0;
        }

        if(n==1)
        {
            return 1;
        }

        return fibo1(n-1) + fibo1(n-2);
    }

    //Approach 2: Memoization {O(n), O(n)}
    public static int fibo2(int n, int[] memo)
    {
        if(n==0)
        {
            return 0;
        }

        if(n==1)
        {
            return 1;
        }

        if(memo[n] != -1)
        {
            return memo[n];
        }

        memo[n] = fibo2(n-1, memo) + fibo2(n-2, memo);
        return memo[n];
    }

    //Approach 3: Iterative {O(n), O(n)}
    public static int fibo3(int n)
    {
        if(n==0)
        {
            return 0;
        }

        if(n==1)
        {
            return 1;
        }

        int[] a = new int[n+1];
        a[0] = 0;
        a[1] = 1;
        for(int i=2;i<=n;i++)
        {
            a[i] = a[i-1] + a[i-2];
        }

        return a[n];
    }

    //Approach 4: Optimized Iterative {O(n), O(1)}
    public static int fibo4(int n)
    {
        if(n==0)
        {
            return 0;
        }

        if(n==1)
        {
            return 1;
        }

        int prev = 0;
        int cur = 1;
        int next = 0;
        for(int i=2;i<=n;i++)
        {
            next = prev + cur;
            prev = cur;
            cur = next;
        }

        return next;
    }

    public static void main(String[] args)
    {
        System.out.println(fibo1(4));

        int[] memo = new int[5];
        Arrays.fill(memo, -1);
        System.out.println(fibo2(4, memo));

        System.out.println(fibo3(4));

        System.out.println(fibo4(4));
    }
}
