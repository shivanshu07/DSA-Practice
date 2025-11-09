/*
 Alternative Elements of Array
 */

class P1{

    //Iterative Approach {O(n), O(1)}
    public static void AltElement1(int[] a)
    {
        for(int i=0;i<=a.length;i=i+2)
        {
            System.out.println(a[i]);
        }
    }

    //Recursive Approach {O(n), O(n)}
    public static void AltElement2(int[] a, int idx)
    {
        if(idx >= a.length)
        {
            return;
        }

        System.out.println(a[idx]);
        AltElement2(a, idx+2);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        AltElement1(arr);
        System.out.println();
        AltElement2(arr, 0);
    }
}