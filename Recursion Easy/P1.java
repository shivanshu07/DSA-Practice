public class P1 {
    //Print Numbers 1 to n
    public static void print1toN(int n)
    {
        if(n == 11)
        {
            return;
        }

        System.out.println(n);
        print1toN(n+1);
    }

    //Print Numbers n to 1
    public static void print1toN2(int n)
    {
        if(n == 0)
        {
            return;
        }

        System.out.println(n);
        print1toN2(n-1);
    }


    public static void main(String[] args)
    {
        print1toN(1);
        System.out.println();
        print1toN2(5);
    }
}
