import java.util.HashSet;

public class P8 {
    //Unique Subsequences of a str
    public static void uniqueSubseq(String s, int idx, String newstr, HashSet<String> set)
    {
        if(idx == s.length())
        {
            if(!set.contains(newstr))
            {
                set.add(newstr);
                System.out.println(newstr); 
            }  
            return;
        }
        char cur = s.charAt(idx);

        uniqueSubseq(s, idx+1, newstr+cur, set);
        uniqueSubseq(s, idx+1, newstr, set);
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        uniqueSubseq("aab", 0, "", set);
    }
}
