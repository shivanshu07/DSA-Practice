/*
 Find distance between two points in a 2d plane
 */
public class P5 {
    //Approach: Using the distance formula {O(1), O(1)}
    public static double findDist(double x1, double y1, double x2, double y2)
    {
        return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
    }
    public static void main(String[] args) {
        System.out.println(findDist(1, 1, 2, 2));
    }
}
