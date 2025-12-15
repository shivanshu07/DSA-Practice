/*
Rearrange array such that even positioned are greater than odd
*/

import java.util.Arrays;

public class P17 {
    //Approach 1: using array sort {O(nlogn), O(n)}
    public static int[] positionElements1(int a[])
    {
        int b[] = new int[a.length];
        int beg = 0, end = a.length-1;
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            if(i%2==0)
            {
                b[i] = a[beg++];
            }
            else{
                b[i] = a[end--];
            }
        }

        return b;
    }

    //Approach 2: Using elements swap {O(n), O(1)}
    public static int[] positionElements2(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            if(i%2==0)
            {
                if(a[i]>a[i-1])
                {
                    int temp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = temp;
                }
            }
            else{
                if(a[i]<a[i-1])
                {
                    int temp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = temp;
                }
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int a[] = {7, 6, 5, 4, 3, 2, 1};
        // int b[] = positionElements1(a);
        int b[] = positionElements2(a);
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i] + " ");
        }
    }
}
