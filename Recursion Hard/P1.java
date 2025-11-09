public class P1{
    //permutaions of a str
    public static void strPermutations(String s, String newstr)
    {
        if(s.length() == 0)
        {
            System.out.println(newstr);
            return;
        }

        for(int i=0;i<s.length();i++)
        {
            char cur = s.charAt(i);
            String substr = s.substring(0, i) + s.substring(i+1);
            strPermutations(substr, newstr+cur);
        }
    }
    public static void main(String[] args) {
        strPermutations("abc", "");
    }
}