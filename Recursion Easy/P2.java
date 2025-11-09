public class P2 {
    //Sum upto n terms
    public static int sumToN(int n)
    {
        if(n == 0)
        {
            return 0;
        }

        return n + sumToN(n-1);
    }

    public static void main(String[] args)
    {
        System.out.println(sumToN(5));
    }
}
