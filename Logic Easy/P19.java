/*
 Find the nth term of the series: 1, 3, 6, 10,...
 */
public class P19 {
    //Approach: Iterative {O(n), O(1)}
    public static int nthTermofseries(int n)
    {
        if(n<=0)
        {
            return -1;
        }

        int ans = 0;
        for(int i=1;i<=n;i++)
        {
            ans = ans + i;
        }

        return ans;
    }

    //Approach 2: using formula {O(1), O(1)}
    public static int nthTermofseries2(int n)
    {
        if(n<=0)
        {
            return -1;
        }

        return n*(n+1)/2;
    }

    public static void main(String[] args){
        System.out.println(nthTermofseries(3));

        System.out.println(nthTermofseries2(3));
    }
}
