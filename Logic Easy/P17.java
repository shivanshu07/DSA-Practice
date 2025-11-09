/*
 Given the day, month and year, determine the day of the week
 */
public class P17 {
    public static String[] day = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    
    //Approach: Zeller's Congruence based approach {O(1), O(1)}
    public static void dayOftheWeek(int d, int m, int y)
    {
        int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
        if(m<3)
        {
            y = y - 1;
        }

        int code = (y + y/4 - y/100 + y/400 + t[m-1] + d)%7;

        System.out.println(day[code]);
    }

    public static void main(String[] args) {
        dayOftheWeek(11, 10, 2025);
    }
}
