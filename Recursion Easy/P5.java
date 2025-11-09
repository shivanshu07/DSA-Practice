public class P5 {
    //Calculate x^n with stack height = n
    public static int printXtoN1(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }

        return x*printXtoN1(x, n-1);
    }

    //Calculate x^n with stack height = log(n)
    public static int printXtoN2(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }

        if(n%2==0)
        {
            return printXtoN2(x, n/2)*printXtoN2(x, n/2);
        }
        else{
            return printXtoN2(x, n/2)*printXtoN2(x, n/2)*x;
        }
    }

    public static void main(String[] args)
    {
        int x=2, n=5;
        System.out.println(printXtoN1(x, n));
        System.out.println(printXtoN2(x, n));
    }
}
