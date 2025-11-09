import java.util.*;

/*
 To see if a number is Even or Odd
 */

class P1{
    //Approach 1: Check the remainder of n {O(1), O(1)}
    public static boolean evenOdd1(int n){
        if(n%2==0)
        {
            return true;
        }

        return false;
    }

    //Approach 2: Use Bitwise AND Operator {O(1), O(1)}
    public static boolean evenOdd2(int n){
        if((n&1)==0)
        {
            return true;
        }

        return false;
    }

    //Approach 3: Use Shift Operator {O(1), O(1)}
    public static boolean evenOdd3(int n){
        if(n==(n >>1)<<1)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(evenOdd1(n));
        System.out.println(evenOdd2(n));
        System.out.println(evenOdd3(n));

        sc.close();
    }
}