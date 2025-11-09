/*
 Find LCM of a and b
 */
public class P13 {
    //Approach 1: Iterative method {O(min(a,b)), O(1)}
    public static int lcm1(int a, int b)
    {
        int lcm=0;
        int big = Math.max(a, b);
        int small = Math.min(a,b);
        for(int i=big;;i=i+big)
        {
            if(i%small==0)
            {
                lcm = i;
                break;
            }
        }

        return lcm;
    }

    //Approach 2: Using formula of LCM and GCD (LCM = a*b/GCD) {O(log(min(a,b))), O(log(min(a,b)))}
    public static int gcd(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b, a%b);
    }

    public static int lcm2(int a, int b)
    {
        return (a*b)/gcd(a, b);
    }

    public static void main(String[] args) {
        System.out.println(lcm1(24, 30));
        System.out.println(lcm2(24, 30));
    }
}
