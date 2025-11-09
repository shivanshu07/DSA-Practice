import java.util.*;

/*
 To find the closest number to n that is divisible by m
 */
public class P5 {
    //Approach 1: Iterative method {O(m), O(1)}
    public static int findNum1(int n, int m){
        int minDiff = Integer.MAX_VALUE;
        int closest = 0;

        for(int i=n-Math.abs(m);i<=n+Math.abs(m);i++)
        {
            if(i%m==0)
            {
                int diff = Math.abs(i - n);
                if(diff<minDiff || (diff == minDiff && Math.abs(i) > Math.abs(closest))){
                    closest = i;
                    minDiff = diff;
                }
            }
        }
        return closest;
    }

    //Approach 2: Finding Quotient {O(1), O(1)}
    public static int findNum2(int n, int m)
    {
        int q = n/m;
        int n1 = q*m;
        
        int n2 = n*m>0 ? m*(q+1) : m*(q-1);

        if(Math.abs(n-n2) > Math.abs(n-n1))
        {
            return n1;
        }

        return n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(findNum1(-15, 6));
        System.out.println(findNum2(-15, 6));
        
        sc.close();
    }
}
