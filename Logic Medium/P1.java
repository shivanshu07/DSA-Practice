/*

 Hollow Rectangle
 * * * * * 
 *       *
 *       *
 * * * * *
 
 */

class P1{
    public static void main(String[] args)
    {
        int cols = 5, rows = 4;

        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=cols;j++)
            {
                if(j==1 || j==cols || i==1 || i==rows)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}