/*
 Find if any pair in an array sum to a target
 */
public class P1{
    //Approach 1: Using nested Loops {O(n^2), O(1)}
    public static boolean sumToTarget(int[] a, int target)
    {
        if(a.length <= 1)
        {
            return false;
        }
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i] + a[j] == target)
                {
                    return true;
                }
            }
        }

        return false;
    }

    //Approach 2: Using two-pointer technique (only sorted array) {O(n), O(1)}
    public static boolean sumToTarget2(int a[], int target)
    {
        if(a.length <= 1)
        {
            return false;
        }

        int left = 0, right = a.length-1;
        while(left < right)
        {
            if(a[left] + a[right] == target)
            {
                return true;
            }

            if(a[left] + a[right] < target)
            {
                left++;
            }

            if(a[left] + a[right] > target)
            {
                right--;
            }

        }

        return false;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        //System.out.println(sumToTarget(arr, 10));
        System.out.println(sumToTarget2(arr, 9));
    }
}