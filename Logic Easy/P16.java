import java.util.*;

/*
 Fizz Buzz
 */
public class P16 {
    //Approach 1: Iterative mmethod {O(n), O(n)}
    public static List<String> fizzbuzz1(int n)
    {
        List<String> res = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0)
            {
                if(i%5==0)
                {
                    res.add("FizzBuzz");
                }
                else{
                    res.add("Fizz");
                }
            }
            else{
                if(i%5==0)
                {
                    res.add("Buzz");
                }
                else{
                    res.add(Integer.toString(i));
                }
            }
        }

        return res;
    }

    //Approach 2: String Concatenation {O(n), O(n)}
    public static List<String> fizzbuzz2(int n)
    {
        List<String> res = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            String s = "";
            if(i%3==0)
            {
                s=s+"Fizz";
            }
            if(i%5==0)
            {
                s=s+"Buzz";
            }
            if(s.isEmpty())
            {
                s=s+i;
            }

            res.add(s);
        }

        return res;
    }

    //Approach 3: Using HashMap {O(n), O(n)}
    public static List<String> fizzbuzz3(int n)
    {
        List<String> res = new ArrayList<>();
        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(3, "Fizz");
        mp.put(5, "Buzz");

        int[] divisors = {3, 5};

        for(int i=1;i<=n;i++)
        {
            StringBuilder s = new StringBuilder();
            for(int d: divisors)
            {
                if(i%d==0)
                {
                    s.append(mp.get(d));
                }
            }

            if(s.length()==0)
            {
                s.append(i);
            }

            res.add(s.toString());
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(fizzbuzz1(3));
        System.out.println(fizzbuzz2(3));
        System.out.println(fizzbuzz3(3));
    }
}
