public class P4 {
    //Fibonacci sum till n
    public static int fibN(int n)
    {
        if(n == 0)
        {
            return 0;
        }

        if(n == 1)
        {
            return 1;
        }

        return fibN(n-1) + fibN(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibN(4));
    }
}
