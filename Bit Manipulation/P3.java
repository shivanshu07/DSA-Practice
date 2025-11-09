public class P3 {
    //Count no. of 1's in n
    public static void countNo1(int a)
    {
        int count = 0;
        while(a > 0)
        {
            a = a & (a-1);
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int a = 7;
        countNo1(a);
    }
}
