/*
    Check if a long int is divisible by 11
 */
public class P15 {
    //Approach: using Differnece of Alternate sum technique {O(n), O(1)}
    public static void isDivisibleBy11(String s)
    {
        int n = s.length();
        int evenSum = 0, oddSum = 0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                evenSum += s.charAt(i) - '0';
            }
            else{
                oddSum += s.charAt(i) - '0';
            }
        }

        System.out.println(Math.abs(evenSum - oddSum)%11 == 0);
    }

    public static void main(String[] args)
    {
        isDivisibleBy11("76945");
    }
}
