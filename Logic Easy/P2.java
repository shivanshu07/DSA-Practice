/*
 Reverse an integer
 */

public class P2 {
    //Approach 1: Iterative method {O(logn), O(1)}
    public static int reverseNum1(int n)
    {
        int revNum = 0;
        while(n>0)
        {
            revNum = revNum*10 + n%10;
            n=n/10;
        }
        return revNum;
    }


    //Approach 2: Recursive method {O(logn), O(logn)}
    public static int reverseNum2(int n, int revNum)
    {
        if(n==0)
        {
            return revNum;
        }
        return reverseNum2(n/10, revNum*10+n%10);
    }

    //Approach 3: Using string {O(logn), O(1)}
    public static int reverseNum3(int n)
    {
        StringBuffer s = new StringBuffer(String.valueOf(n));

        s.reverse();

        n = Integer.parseInt(String.valueOf(s));

        return n;
    }

    public static void main(String[] args) {
        System.out.println(reverseNum1(456));
        System.out.println(reverseNum2(456, 0));
        System.out.println(reverseNum3(456));
    }
}
