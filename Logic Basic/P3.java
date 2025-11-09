import java.util.*;
/*
 Calculate sum of first N natural numbers
 */
public class P3 {
    //Approach 1: Iterative method {O(n), O(1)}
    public static int sumTillN1(int n){
        int sum = 0;

        for(int i=1;i<=n;i++)
        {
            sum = sum + i;
        }

        return sum;
    }

    //Approach 2: Recursive method {O(n), O(n)}
    public static int sumTillN2(int n)
    {
        if(n == 1)
        {
            return 1;
        }

        return n + sumTillN2(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("The sum of first "+ n + " natural numbers is "+ sumTillN1(n));
        System.out.println("\nRecursive way:");
        System.out.println("The sum of first "+ n + " natural numbers is "+ sumTillN2(n));
        sc.close();
    }
}
