/*
 Largest Three Distinct Elements in array
 */

public class P5 {
    //One Traversal {O(n), O(1)}
    public static void FindLargestThree(int[] a)
    {
        int fst = Integer.MIN_VALUE;
        int snd = Integer.MIN_VALUE;
        int trd = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>fst)
            {
                trd = snd;
                snd = fst;
                fst = a[i];
            }
            else if(a[i]<fst && a[i]>snd && a[i]>trd)
            {
                trd = snd;
                snd = a[i];
            }
            else if(a[i]<fst && a[i]<snd && a[i]>trd)
            {
                trd = a[i];
            }
        }

        System.out.println("First: " + fst);
        System.out.println("Second: " + snd);
        System.out.println("Third: "+ trd);

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 10, 11, 9};

        FindLargestThree(arr);
    }
}
