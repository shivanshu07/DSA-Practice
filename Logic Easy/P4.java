/*
 Check if y is a power of x
 */
public class P4 {
    //Approach 1: Repeated multiplication method (considers only integer power) {O(logy), O(1)}
    public static boolean isXpowY1(int x, int y)
    {
        if(x==1)
        {
            return y==1;
        }
        int power = 1;

        while(power < y)
        {
            power = power * x;
        }

        return power == y;
    }

    //Approach 2: Exponentiation and binary search method {O(log(log(y))), O(1)}
    public static boolean isXpowY2(int x, int y)
    {
        if (x == 1) return (y == 1);

        long pow = x;

        while (pow < y) {
            pow *= pow;
        }

        if (pow == y) return true;

        long low = x, high = pow;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long result = (long) Math.pow(x, Math.log(mid) / Math.log(x));

            if (result == y) return true;
            if (result < y) low = mid + 1;
            else high = mid - 1;
        }

        return false;
    }

    //Approach 3: Using Logarithm {O(1), O(1)}
    public static boolean isXpowY3(int x, int y)
    {
        double res = Math.log(y)/Math.log(x);
        return res == Math.floor(res);
    }

    public static void main(String[] args) {
        System.out.println(isXpowY1(10, 1000));
        System.out.println(isXpowY2(2, 30));
        System.out.println(isXpowY3(10, 1000));
    }
}
