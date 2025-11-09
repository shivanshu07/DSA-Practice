/*
 Check if a number is a palindrome number
 */
public class P21 {
    //Using reverse of a number
    public static void isPal(int n)
    {
        int temp = Math.abs(n);
        int reverse = 0;

        while(temp > 0)
        {
            int digit = temp%10;
            reverse = reverse*10 + digit;
            temp = temp/10;
        }

        if(Math.abs(n) == reverse)
        {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

    public static void main(String[] args)
    {
        isPal(1234);
    }
}
