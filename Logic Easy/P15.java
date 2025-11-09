import java.util.*;

/*
 Add two fractions
 */
public class P15 {
    //Approach: Using GCD and LCM {O(log(min(a,b))), O(1)}
    public static int gcd(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b, a%b);
    }

    public static List<Integer> addfraction(List<Integer> a, List<Integer> b)
    {
        List<Integer> ans = new ArrayList<>();

        int den = (a.get(1)/gcd(a.get(1), b.get(1)))*b.get(1);
        int num = a.get(0)*(den/a.get(1)) + b.get(0)*(den/b.get(1));

        int common_fac = gcd(num, den);

        ans.add(num/common_fac);
        ans.add(den/common_fac);

        return ans;

    } 
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        a.add(1);
        a.add(3);

        b.add(3);
        b.add(9);

        System.out.println(addfraction(a, b));
    }
}
