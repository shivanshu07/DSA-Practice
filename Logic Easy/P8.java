/*
 Find factorial of a number
 */
public class P8 {
    //Approach 1: Iterative method {O(n), O(1)}
    public static int factN1(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        int fact = 1, i=1;
        while(i<=n)
        {
            fact = fact*i;
            i++;
        }

        return fact;
    }

    //Approach 2: Recursive method {O(n), O(n)}
    public static int factN2(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        

        return n*factN2(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factN1(5));
        System.out.println(factN2(5));
    }
}
