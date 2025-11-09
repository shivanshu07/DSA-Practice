public class P1{
    //Tower of Hanoi
    public static void towerOfHanoi(int n, String src, String hlp, String dst)
    {
        if(n==0)
        {
            return;
        }

        towerOfHanoi(n-1, src, dst, hlp);
        System.out.println("Placing disk " + n + " from " + src + " to " + dst);
        towerOfHanoi(n-1, hlp, src, dst);
    }

    public static void main(String[] args)
    {
        towerOfHanoi(3, "src", "hlp", "dst");
    }
}