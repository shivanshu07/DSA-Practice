public class P2 {
    //Check if n is a power of 2
    public static void checkPow2(int a)
    {   
        if((a & (a-1) )==0)
        {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

    public static void main(String[] args)
    {
        int a = 16;
        checkPow2(a);
    }
}
