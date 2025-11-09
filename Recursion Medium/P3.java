public class P3 {
    public static int first = -1;
    public static int last = -1;
    //Find first and last occurence of a char in a str
    public static void findFirstAndLast(String s, char e, int idx)
    {
        if(idx == s.length())
        {
            System.out.println("First: " + first + ", Last: " + last);
            return;
        }

        char cur = s.charAt(idx);
        if(cur == e)
        {
            if(first == -1)
            {
                first = idx;
                last = idx;
            }
            else{
                last = idx;
            }
        }

        findFirstAndLast(s, e, idx+1);
    }
    public static void main(String[] args)
    {
        findFirstAndLast("baseball", 'e', 0);
    }
}
