import java.util.ArrayList;

public class P5 {
    //Find all subsets of a set upto n numbers
    public static void findSubarray(int n, ArrayList<Integer> subset)
    {
        if(n == 0)
        {
            for(int i=0;i<subset.size();i++)
            {
                System.out.print(subset.get(i) + " ");
            }
            System.out.println();
            return;
        }

        //element added
        subset.add(n);
        findSubarray(n-1, subset);

        //element not added
        subset.remove(subset.size()-1);
        findSubarray(n-1, subset);
    }

    public static void main(String[] args) {
        ArrayList<Integer> subset = new ArrayList<Integer>();
        findSubarray(3, subset);
    }
}
