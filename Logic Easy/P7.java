/*
 Check if two rectangles overlap
 */
public class P7 {
    //Approach: Comparing coordinates {O(1), O(1)}
    public static boolean checkRect(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
    {
        if(((y1>y4 || y3>y2) && x2>x3) || ((y1>y4 || y3>y2) && x4>x1))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkRect(0, 10, 10, 0, 5, 5, 15, 0));
    }
}
