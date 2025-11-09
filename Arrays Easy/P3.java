import java.util.Arrays;
import java.lang.Math;
/*
 Largest Element in array
 */

public class P3 {
    //Iterative method {O(n), O(1)}
    public static int LargestElement1(int a[])
    {
        if(a.length<1)
        {
            return -1;
        }

        int max = a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }

        return max;
    }

    //Recursive method {O(n), O(n)}
    public static int LargestElement2(int a[], int i)
    {
        if(i == a.length-1)
        {
            return a[i];
        }

        int max = LargestElement2(a, i+1);
        return Math.max(a[i], max);
    }

    //Using Inbuilt function Sort {O(n), O(1)}
    public static int LargestElement3(int[] a)
    {
        Arrays.sort(a);
        return a[a.length-1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 10, 11};

        System.out.println(LargestElement1(arr));
        System.out.println(LargestElement2(arr, 0));
        System.out.println(LargestElement3(arr));
    }
}
