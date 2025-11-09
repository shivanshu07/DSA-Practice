/*
 Find sum of squares of first n natural numbers
 */
public class P10 {
    //Approach 1: Iterative method {O(n), O(1)}
    public static int sumOfSquares1(int n)
    {
        int i=1, sum=0;
        while(i<=n)
        {
            sum = sum + i*i;
            i++;
        }

        return sum;
    }

    //Approach 2: Using mathematical formula {O(1), O(1)}
    public static int sumOfSquares2(int n)
    {
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }

    //Approach 3: Using mathematical formula (avoiding overflow) {O(1), O(1)}
    public static int sumOfSquares3(int n)
    {
        return ((n * (n + 1) /2)*( (2 * n + 1)) / 3);
    }

    //Approach 4: Recursive method {O(n), O(n)}
    public static int sumOfSquares4(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*n + sumOfSquares4(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sumOfSquares1(2));
        System.out.println(sumOfSquares2(2));
        System.out.println(sumOfSquares3(2));
        System.out.println(sumOfSquares4(2));
    }
}
