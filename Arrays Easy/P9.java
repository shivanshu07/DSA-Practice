/*
 Sample Program
 */
public class P9 {
    public static void f1(int[] a)
    {
        a[0] = 10;
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    public static void f2(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        f1(arr);
        System.out.println();
        f2(arr);
    }
}
