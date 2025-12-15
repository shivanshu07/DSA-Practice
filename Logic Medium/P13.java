/*
 Count numbers having exactly three divisors
 */

public class P13 {
    //Approach 1: Using loops {O(n^2), O(1)}
    public static void countNfor3Divisors(int n)
    {
        int total = 0;
        for(int i=1;i<=n;i++)
        {
            int divCount = 0;
            for(int j=1;j<=n;j++)
            {
                if(i%j == 0)
                {
                    divCount++;
                }
            }

            if(divCount == 3)
            {
                total++;
            }
        }

        System.out.println(total);
    }

    //Approach 2: Using mathematical reasoning, only squares of primes have 3 divisors {O(nlog(logn)), O(1)}
    public static boolean isPrime(double x)
    {
        for(int i=2;i*i<=x;i++)
        {
            if(x%i == 0)
            {
                return false;
            }
        }

        return true;
    }
    
    public static void countNfor3Divisors2(int n)
    {
        int total = 0;
        for(int i=2;i*i<=n;i++)
        {
            if(isPrime(i))
            {
                total++;
            }
        }

        System.out.println(total);
    }

    public static void main(String[] args)
    {
        countNfor3Divisors(16);
        countNfor3Divisors2(16);
    }
}
