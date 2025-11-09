/*
 Reverse an Array
 */
public class P11 {
    //Using Temporary Array {O(n), O(n)}
    public static void ReverseArray1(int a[])
    {
        int[] temp = new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            temp[i] = a[a.length - i -1];
        }

        for(int i=0;i<a.length;i++)
        {
            a[i] = temp[i];
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }

    //Using Two Pointers {O(n), O(1)}
    public static void ReverseArray2(int[] a)
    {
        int left = 0;
        int right = a.length-1;
        while(left < right)
        {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }

    //By Swapping Elements {O(n), O(1)}
    public static void ReverseArray3(int[] a)
    {
        for(int i=0;i<=a.length/2;i++)
        {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }

    //Using Recursion {O(n), O(n)}
    public static void ReverseArray4(int[] a, int left, int right)
    {
        if(left > right)
        {
            return;
        }

        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;

        ReverseArray4(a, left+1, right-1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // ReverseArray1(arr);
        // ReverseArray2(arr);
        // ReverseArray3(arr);
        ReverseArray4(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
