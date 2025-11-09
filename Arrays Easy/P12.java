/*
 Rotate an Array (Right Rotate/Clockwise)
 */
public class P12 {
    //Rotate one-by-one {O(n*d), O(1)}
    public static void RotateArray1(int[] a, int d)
    {
        for(int i=0;i<d;i++)
        {
            int temp = a[a.length-1];
            for(int j=a.length-1;j>0;j--)
            {
                a[j] = a[j-1];
            }
            a[0] = temp;
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }

    //Using Temporary Array {O(n), O(n)}
    public static void RotateArray2(int[] a, int d)
    {
        int n = a.length;
        d = d%n;
        int[] temp = new int[n];

        int j=0;
        for(int i=n-d;i<n;i++)
        {
            temp[j] = a[i];
            j++;
        }

        for(int i=0;i<n-d;i++)
        {
            temp[j] = a[i];
            j++;
        }

        for(int i=0;i<n;i++)
        {
            a[i] = temp[i];
            System.out.print(a[i] + " ");
        }
    }

    //Juggling Algorithm {O(n), O(1)}
    public static void RotateArray3(int[] a, int d)
    {
        return;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        // RotateArray1(arr, 2);
        // RotateArray2(arr, 2);
        RotateArray3(arr, 2);
    }
}
