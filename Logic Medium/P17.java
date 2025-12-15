/*
 kth digit in a raised to b
 */
public class P17 {
    //Using modular exponentiation {O(logb), O(1)}
    public static void getKthDigit(int a, int b, int k)
    {
        long mod = (long)Math.pow(10, k);
        long res = 1;
        long base = a;

        while(b > 0)
        {
            if((b&1) == 1)
            {
                res = (res*base) %mod;
            }
            
            base = (base*base) %mod;
            b = b>>1;
        }

        for(int i=1;i<k;i++)
        {
            res = res/10;
        }

        System.out.println((int)res);
    }
    
    public static void main(String[] args) {
        getKthDigit(5, 2, 2);
    }
}
