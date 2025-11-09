public class P3 {
    //Factorial of n
    public static int factOfN(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }

        return n*factOfN(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factOfN(5));
    }
}
