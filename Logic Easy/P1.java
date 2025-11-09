// import java.util.*;

/*
 Find the sum of digits of a number
 */
public class P1{
    //Approach 1: Iterative method {O(logn), O(1)}
    public static int sumOfDigits1(int n)
    {
        int sum = 0;
        while(n!=0)
        {
            sum = sum + n%10;
            n=n/10;
        }

        return sum;
    }

    //Approach 2: Recursive method {O(logn), O(logn)}
    public static int sumOfDigits2(int n)
    {
        if(n==0)
        {
            return 0;
        }

        return n%10 + sumOfDigits2(n/10);
    }

    //Approach 3: subtract ASCII value of '0' from string characters {O(logn), O(1)}
    //Useful for calculating sum of digits of a very long int
    public static int sumOfDigits3(String n)
    {
        int sum = 0;
        for(int i=0;i<n.length();i++)
        {
            sum = sum + (n.charAt(i) - '0');
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits1(15));
        System.out.println(sumOfDigits2(15));
        System.out.println(sumOfDigits3("15"));
    }
}