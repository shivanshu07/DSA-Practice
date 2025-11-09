/*
 Calculate square root of a number
 */
public class P9 {
    //Approach 1: Iterative method {O(sqrt(n)), O(1)}
    public static int sqrtOfN1(int n)
    {
        int res = 1;
        while(res*res<=n)
        {
            res++;
        }

        return res-1;
    }

    //Approach 2: binary search {O(log(n)), O(1)}
    public static int sqrtOfN2(int n)
    {
        int low = 1, high = n;
        int res = 1;

        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if(mid*mid<=n)
            {
                res = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return res;
    }

    //Approach 3: Using built-in function {O(1), O(1)}
    public static int sqrtOfN3(int n)
    {
        return (int)Math.sqrt(n);
    }

    //Approach 4: Using mathematical formula {O(1), O(1)}
    public static int sqrtOfN4(int n)
    {
        int res = (int)Math.exp(0.5 * Math.log(n));
        
        if((res + 1) * (res + 1) <= n) 
        {
            res++;
        }
        
        return res;
    }

    public static void main(String args[])
    {
        System.out.println(sqrtOfN1(16));
        System.out.println(sqrtOfN2(16));
        System.out.println(sqrtOfN3(16));
        System.out.println(sqrtOfN4(16));
    }
}
