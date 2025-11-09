public class P4 {
    //Check if the array is strictly sorted
    public static boolean isSortedArray(int[] a, int idx)
    {
        if(idx == a.length-1)
        {
            return true;
        }

        if(a[idx] >= a[idx+1])
        {
            return false;
        }

        return isSortedArray(a, idx+1);
    }
    
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4};
        System.out.println(isSortedArray(a, 0));
    }
}
