import java.util.*;
/*
 Find number opposite to N in a die
 */

public class P6 {
    //Approach 1: If-else condition {O(1), O(1)}
    public static int getOppN1(int n)
    {
        if(n==1)
        {
            return 6;
        }
        else if(n==2)
        {
            return 5;
        }
        else if(n==3)
        {
            return 4;
        }
        else if(n==4)
        {
            return 3;
        }
        else if(n==5)
        {
            return 2;
        }
        else if(n==6)
        {
            return 1;
        }

        return -1;
        
    }

    //Approach 2: Sum of numbers {O(1), O(1)}
    public static int getOppN2(int n)
    {
        return 7-n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getOppN1(2));
        System.out.println(getOppN2(4));
        sc.close();
    }
}
