public class P2 {
    //Insertion Sort {O(n^2), O(1)}
    public static void insertionSort(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            int key = a[i];
            int j;
            for(j=i-1;j>=0;j--)
            {
                if(a[j]>key)
                {
                    a[j+1] = a[j];
                }
            }
            a[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
