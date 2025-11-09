public class P13 {
    //Approach 1: Using temporary array {O(n), O(n)}
    public static int[] zerosToEnd1(int a[])
    {
        int temp[] = new int[a.length];
        int j=0;

        for(int i=0;i<a.length;i++)
        {
            if(a[i] != 0)
            {
                temp[j++] = a[i];
            }
        }

        while(j<a.length)
        {
            temp[j++] = 0;
        }

        return temp;
    }

    //Approach 2: Two Traversals {O(n), O(1)}
    public static int[] zerosToEnd2(int a[])
    {
        int count = 0, i = 0;
        while(i<a.length)
        {
            if(a[i] != 0)
            {
                a[count] = a[i];
                count++;
            }
            i++;
        }

        for(int k=count;k<a.length;k++)
        {
            a[k] = 0;
        }

        return a;
    }

    //Approach 3: One Traversal {O(n), O(1)}
    public static int[] zerosToEnd3(int a[])
    {
        int count = 0, i = 0;
        while(i<a.length)
        {
            if(a[i] != 0)
            {
                int temp = a[count];
                a[count] = a[i];
                a[i] = temp;
                count++;
            }
            i++;
        }

        return a;
    }

    public static void main(String[] args)
    {
        int arr[] = {1, 2, 0, 3, 4, 0};

        //int temp[] = zerosToEnd1(arr);
        //int temp[] = zerosToEnd2(arr);
        int temp[] = zerosToEnd3(arr);

        for(int i=0;i<temp.length;i++)
        {
            System.out.print(temp[i] + " ");
        }
    }
}
