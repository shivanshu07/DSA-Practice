public class P3 {
    //No of ways to place 1xm tiles on the floor of size nxm
    public static int placeTiles(int n, int m)
    {
        if(n == m)
        {
            return 2;
        }

        if(n < m)
        {
            return 1;
        }

        int verticalPaths = placeTiles(n-m, m);
        int horizontalPaths = placeTiles(n-1, m);

        return verticalPaths + horizontalPaths;
    }

    public static void main(String[] args)
    {
        System.out.println(placeTiles(4, 2));
    }
}
