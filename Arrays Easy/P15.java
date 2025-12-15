public class P15 {
    //Min cost to make array size 1 (keep removing the larger element from pairs)
    public static int minToSize1(int a[])
    {
        int min = Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(min>a[i])
            {
                min = a[i];
            }
        }

        return (a.length-1)*min;
    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 2};
        System.out.println(minToSize1(arr));
    }
}
