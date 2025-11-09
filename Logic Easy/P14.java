/*
 Check if n is a perfect number (sum of its proper divisors)
 */
public class P14 {
    //Approach 1: Iterative method {O(n), O(1)}
    public static boolean isNperfect1(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum = sum + i;
            }
        }

        return sum==n;
    }

    //Approach 2: Optimized divisor search method {O(sqrt(n)), O(1)}
    public static boolean isNperfect2(int n)
    {
        int sum=1;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                if(i*i!=n)
                {
                    sum = sum + i + n/i;
                }
                else{
                    sum = sum + i;
                }
            }
        }

        return sum==n && n!=1;
    }

    public static void main(String[] args) {
        System.out.println(isNperfect1(28));
        System.out.println(isNperfect2(28));
    }
}
