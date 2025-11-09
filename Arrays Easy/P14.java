public class P14 {
    //Approach: Using Max of the array {O(n), O(1)}
    public static int minOpToK(int a[], int k)
    {
        int res = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            max = Math.max(a[i], max);
        }

        for(int i=0;i<a.length;i++)
        {
            if((max - a[i])%k != 0)
            {
                return -1;
            }

            res += (max - a[i])/k;
        }

        return res;
    }

    public static void main(String[] args)
    {
        int arr[] = {4, 7, 19, 16};
        int k = 3;
        System.out.println(minOpToK(arr, k));
    }
}
