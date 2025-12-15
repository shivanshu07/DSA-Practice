/*
 Find the sqrt of n
 */
public class P12 {
    //Approach 1: Using Loop {O(sqrt(n)), O(1)}
    public static void sqrt1(int n)
    {
        int res = 1;
        while(res*res <= n)
        {
            res++;
        }

        System.out.println(res-1);
    }

    //Approach 2: Using binary search {O(logn), O(1)}
    public static void sqrt2(int n)
    {
        int low = 1, high = n;
        int res = 1;

        while(low <= high)
        {
            int mid = low + (high - low)/2;
            res = mid;
            if(mid*mid > n)
            {
                high = mid - 1;
            }
            else if(mid*mid < n){
                low = mid + 1;
            }
            else{
                break;
            }

        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        sqrt1(16);
        sqrt2(16);
    }
}
