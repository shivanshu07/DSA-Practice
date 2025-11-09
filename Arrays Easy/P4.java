import java.util.*;
/*
 Second Largest Element in array
 */
public class P4 {
    //Iterative method {O(nlogn), O(1)}
    public static int SecondLargest1(int a[])
    {
        int n = a.length;
        Arrays.sort(a);
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]!=a[n-1])
            {
                return a[i];
            }
        }

        return -1;
    }

    //Two Pass Search {O(n), O(1)}
    public static int SecondLargest2(int a[])
    {
        int max = -1, sec_max = -1;
        int n = a.length;

        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }

        for(int i=0;i<n;i++)
        {
            if(a[i]!=max && a[i]>sec_max)
            {
                sec_max = a[i];
            }
        }

        return sec_max;
    }

    //One Pass search {O(n), O(1)}
    public static int SecondLargest3(int a[])
    {
        int max = -1, sec_max = -1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                sec_max = max;
                max = a[i];
            }
            else if(a[i]<max && a[i]>sec_max)
            {
                sec_max = a[i];
            }
        }

        return sec_max;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 4};

        System.out.println("Second Largest Element: " + SecondLargest1(arr));
        System.out.println("Second Largest Element: " + SecondLargest2(arr));
        System.out.println("Second Largest Element: " + SecondLargest3(arr));
    }
}
