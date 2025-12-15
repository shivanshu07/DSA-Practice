/*
    Maximum profit earned by buying/selling stocks
*/
public class P3 {
    //Accumulating profits: {O(n), O(1)}
    public static void maxProfit(int a[])
    {
        int res=0;
        for(int i=1;i<a.length;i++)
        {
            if(a[i] > a[i-1])
            {
                res += a[i] - a[i-1];
            }
        }

        System.out.println("Max profit: " + res);
    }

    public static void main(String[] args) {
        int arr[] = {100, 180, 260, 310, 40, 535, 695};
        maxProfit(arr);
    }
}
