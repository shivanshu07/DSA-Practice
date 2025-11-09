/*
 Check if the number is prime
 */
public class P3 {
    //Approach 1: Iterative method {O(n), O(1)}
    public static boolean isPrime1(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    //Approach 2: Square root of N {O(sqrt(n)), O(1)}
    public static boolean isPrime2(int n)
    {
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    //Approach 3: Optimized method (using 6k+1) {O(sqrt(n)), O(1)}
    public static boolean isPrime3(int n)
    {
        if(n==2 || n==3)
        {
            return true;
        }

        if(n<=1 || n%2==0 || n%3==0)
        {
            return false;
        }

        for(int i=5;i<Math.sqrt(n);i++)
        {
            if(n%i==0 || n%(i+2)==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime1(29));
        System.out.println(isPrime2(29));
        System.out.println(isPrime3(29));
    }
}
