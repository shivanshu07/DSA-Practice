/*
 Linear Search
 */

public class P2 {
    //Iterative method {O(n), O(1)}
    public static int LinearSearch1(int[] a, int e)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i] == e)
            {
                return i;
            }
        }

        return -1;
    } 

    public static void main(String args[])
    {
        int[] arr = {10, 20, 30, 40, 50, 60};
        System.out.println(LinearSearch1(arr, 20));
    }
}
