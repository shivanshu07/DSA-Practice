public class P3 {
    //Selection Sort {O(n^2), O(1)}
    public static void selectionSort(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            int min_idx = i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min_idx])
                {
                    min_idx = j;
                }
            }

            int temp = a[i];
            a[i] = a[min_idx];
            a[min_idx] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};

        selectionSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
