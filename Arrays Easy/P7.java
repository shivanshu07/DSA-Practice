/*
 Check if the array is sorted
 */
public class P7 {
    //Iterative method {O(n), O(1)}
    public static boolean isSorted1(int[] a)
    {
        if(a.length == 0 || a.length == 1)
        {
            return true;
        }

        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            {
                return false;
            }
        }

        return true;
    }

    //Recursive method {O(n), O(n)}
    public static boolean isSorted2(int[] a, int n)
    {
        if(n == 0 || n == 1)
        {
            return true;
        }

        return a[n-1]>=a[n-2] && isSorted2(a, n-1);
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 5, 6};
        System.out.println(isSorted1(arr));
        System.out.println(isSorted2(arr, 5));
    }
}
