/*
 check if the triangle is valid
 */
public class P6 {
    //Approach: Using the triangle law {O(1), O(1)}
    public static String isValidTriangle(int a, int b, int c)
    {
        if(a+b > c && b+c > a && a+c>b)
        {
            return "Valid";
        }

        return "Invalid";
    }
    public static void main(String[] args) {
        System.out.println(isValidTriangle(1, 10, 12));
    }
}
