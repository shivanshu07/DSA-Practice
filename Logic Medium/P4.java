/*

 Rotated Half-Triangle
       *
     * *
   * * *
 * * * *
 
 */

public class P4 {
    public static void main(String[] args) {
        int rows = 4, cols=5;

        for(int i=1;i<=rows;i++)
        {
            for(int j=i;j<cols;j++)
            {
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
