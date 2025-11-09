import java.util.*;
/*
 Leaders in array (a[i] > all right-side elements)
 */
public class P6 {
    //Iterative Approach {O(n^2), O(1)}
    public static List<Integer> FindLeaders1(int[] a)
    {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            int j;
            for(j=i+1;j<a.length;j++)
            {
                if(a[i] < a[j])
                {
                    break;
                }
            }

            if(j == a.length)
            {
                l.add(a[i]);
            }
        }

        return l;
    }

    //Suffix maximum method {O(n), O(1)} (Finding and adding max from the right)
    public static List<Integer> FindLeaders2(int[] a)
    {
        ArrayList<Integer> l = new ArrayList<>();
        int max_right = a[a.length-1];
        l.add(max_right);

        for(int i=a.length-2;i>=0;i--)
        {
            if(a[i]>=max_right)
            {
                max_right = a[i];
                l.add(max_right);
            }
        }

        Collections.reverse(l);
        return l;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 12, 3, 7, 8, 10};
        System.out.println(FindLeaders1(arr));
        System.out.println(FindLeaders2(arr));
    }
}
