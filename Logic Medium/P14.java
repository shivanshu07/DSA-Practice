/*
 Check if a long int is divisible by 4
 */
public class P14 {
    //Approach 1: Using modulo operator {O(1), O(1)}
    public static void isDivisbleBy4(long n)
    {
        if(n%4 == 0)
        {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

    //Approach 2: Check divisibility of last 2 digits {O(1), O(1)}
    public static void isDivisbleBy4_2(String s)
    {
        int n = s.length();

        if(n == 0)
        {
            System.out.println(false);
            return;
        }

        if(n == 1)
        {
            System.out.println((s.charAt(0) - '0')%4 == 0);
        }

        int lastDigit = s.charAt(n-1) - '0';
        int seclastDigit = s.charAt(n-2) - '0';

        System.out.println((seclastDigit*10 + lastDigit)%4 == 0);
    }

    public static void main(String[] args)
    {
        long n = 123456758933l;
        isDivisbleBy4(n);
        isDivisbleBy4_2("123456758933l");

    }
}
