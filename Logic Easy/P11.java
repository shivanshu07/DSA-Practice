/*
 Find pairs (a,b) whose cubes sum to n
 */
public class P11 {
    //Approach 1: Iterative method {O(n^2), O(1)}
    public static int countCubePairs1(int n)
    {
        int count = 0;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i*i*i + j*j*j ==n)
                {
                    count++;
                }
            }
        }

        return count;
    }

    //Approach 2: Iterating till n^1/3 {O(n^1/3), O(1)}
    public static int countCubePairs2(int n)
    {
        int count = 0;
        for(int i=1;i<=Math.cbrt(n);i++)
        {
            int cb = i*i*i;
            int diff = n - cb;
            int diffcbrt = (int)Math.cbrt(diff);

            if(diffcbrt*diffcbrt*diffcbrt == diff)
            {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args)
    {
        System.out.println(countCubePairs1(9));
        System.out.println(countCubePairs2(9));
    }
}
