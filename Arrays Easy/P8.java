import java.util.HashSet;
/*
 Remove duplicates from sorted array
 */

public class P8 {
    //Using Hash-set {O(n), O(n)}
    public static void RemDuplicates1(int a[])
    {
        HashSet<Integer> s = new HashSet<Integer>();
        int idx = 0;
        for(int i=0;i<a.length;i++)
        {
            if(!s.contains(a[i]))
            {
                s.add(a[i]);
                a[idx++] = a[i];
            }
        }

        for(int j=0;j<idx;j++)
        {
            System.out.print(a[j] + " ");
        }
    }

    //Efficient method {O(n), O(1)}
    public static void RemDuplicates2(int[] a)
    {
        int idx = 0;
        
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                a[idx++] = a[i];
            }
        }

        a[idx++] = a[a.length-1];

        for(int j=0;j<idx;j++)
        {
            System.out.print(a[j] + " ");
        }

    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 5};
        RemDuplicates1(arr);
        
        System.out.println();

        int[] ar = {1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 5};
        RemDuplicates2(ar);
    }
}
