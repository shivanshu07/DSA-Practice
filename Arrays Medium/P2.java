/*
Sum of all subarrays
*/
public class P2 {

    //Approach 1: Using nested loops: {O(n^2), O(1)}
    public static int sumSubArrays1(int a[])
    {
        int sum = 0;
        for(int i=0;i<a.length;i++)
        {
            int temp=0;
            for(int j=i;j<a.length;j++)
            {
                temp += a[j];
                sum += temp;
            }
        }

        return sum;
    }

    //Approach 2: Using element contribution method {O(n), O(1)}
    public static int sumSubArrays2(int a[])
    {
        int sum = 0;
        for(int i=0;i<a.length;i++)
        {
            sum += a[i]*(i+1)*(a.length-i);
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        System.out.println(sumSubArrays1(arr));
        System.out.println(sumSubArrays2(arr));
    }
}
