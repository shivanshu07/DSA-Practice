import java.lang.Math;
/*
 Find GCD of a and b
 */
 import java.math.BigInteger;

public class P12 {
    //Approach 1: Naive approach (one by one check) {O(min(a,b)), O(1)}
    public static int gcd1(int a, int b)
    {
        int Result = Math.min(a, b);
        while(Result>0)
        {
            if(a%Result==0 && b%Result==0)
            {
                break;
            }
            Result--;
        }

        return Result;
    }

    //Approach 2: Euclidean algorithm (Repeated subtraction) {O(min(a,b)), O(min(a,b))}
    public static int gcd2(int a, int b)
    {
        if(a==0)
        {
            return b;
        }
        if(b==0)
        {
            return a;
        }
        if(a==b)
        {
            return a;
        }

        if(a>b)
        {
            return gcd2(a-b,b);
        }
        
        return gcd2(a,b-a);
        
    }

    //Approach 3: Optimized Euclidean algorithm (check divsibility first) {O(min(a,b)), O(1)}
    public static int gcd3(int a, int b)
    {
        if(a==0)
        {
            return b;
        }
        if(b==0)
        {
            return a;
        }
        if(a==b)
        {
            return a;
        }

        if(a>b)
        {
            if(a%b==0)
            {
                return b;
            }
            return gcd2(a-b,b);
        }
        if(b%a==0)
        {
            return a;
        }
        
        return gcd2(a,b-a);
    }

    //Approach 4: Optimized Division based Euclidean {O(log(min(a,b))), O(log(min(a,b)))}
    public static int gcd4(int a, int b)
    {
        if(b==0)
        {
            return a;
        }

        return gcd4(b, a%b);
    }

    //Approach 5: Using built-in functions {O(log(min(a,b))), O(1)}
    public static int gcd5(int a, int b)
    {
        BigInteger bigA = BigInteger.valueOf(Math.abs(a));
        BigInteger bigB = BigInteger.valueOf(Math.abs(b));
        BigInteger gcd = bigA.gcd(bigB);
        return gcd.intValue();
    }

    public static void main(String[] args) {
        System.out.println("GCD: "+gcd1(98, 56));
        System.out.println("GCD: "+gcd2(98, 56));
        System.out.println("GCD: "+gcd3(98, 56));
        System.out.println("GCD: "+gcd4(98, 56));
        System.out.println("GCD: "+gcd5(98, 56));
    }
}
