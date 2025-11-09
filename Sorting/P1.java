class P1{
    //Bubble Sort {O(n^2), O(1)}
    public static void bubbleSort(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            boolean swapped = false;
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        bubbleSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}