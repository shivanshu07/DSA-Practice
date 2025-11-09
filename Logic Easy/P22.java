public class P22 {
    //Approach 1: Sum until it is a single digit {O(logn), O(logn)}
    public static int findSum(int n)
    {
        if(n < 10){
            return n;
        }
        else{
            return n%10 + findSum(n/10);
        }
    }

    public static int digitalRoot(int n)
    {
        int sum = findSum(n);
        while(sum >= 10)
        {
             sum = findSum(sum);
        }

        return sum;
    }


    public static void main(String[] args)
    {
        System.out.println(digitalRoot(999999));
    }
}
