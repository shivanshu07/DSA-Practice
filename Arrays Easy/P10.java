/*
 Generating all subarrays
 */
public class P10 {
    //Iterative method {O(n^3), O(1)}
    public static void GetSubarray1(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        GetSubarray1(arr);
    }
}
