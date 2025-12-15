/*
Duplicate within k distance in Array
*/

import java.util.HashSet;

public class P16 {
    //Naive Approach: {O(n*k), O(1)}
    public static boolean duplWithinKDist1(int a[], int k)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int c=i;c<=k && (i+c)<a.length;c++)
            {
                int j = i+c;
                if(a[i] == a[j])
                {
                    return true;
                }
            }
        }

        return false;
    }

    //Using Hashset: {O(n), O(k)}
    public static boolean duplWithinKDist2(int a[], int k)
    {
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
            if(s.contains(a[i]))
            {
                return true;
            }
            
            s.add(a[i]);
            if(i>=k)
            {
                s.remove(a[i-k]);
            }
            
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(duplWithinKDist1(arr, 3));
        System.out.println(duplWithinKDist2(arr, 3));
    }
}
