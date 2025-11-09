public class P20 {
    //Approach 1: Using iteration {O(nlogn), O(1)}
    public static boolean isArmstrong1(int n)
    {
        if(n<=9)
        {
            return true;
        }

        int digits=0;
        while(n>0)
        {
            n=n/10;
            digits++;
        }

        int sum=0;
        while(n>0)
        {
            sum += Math.pow(n%10, digits);
        }

        if(sum == n)
        {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong1(153));
    }
}
