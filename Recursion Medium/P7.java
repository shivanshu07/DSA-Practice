public class P7 {
    //Print all subsequences of a str
    public static void subsequenceOfStr(String s, int idx, String newstr)
    {
        if(idx == s.length())
        {
            System.out.println(newstr);
            return;
        }

        char cur = s.charAt(idx);
        subsequenceOfStr(s, idx+1, newstr+cur);
        subsequenceOfStr(s, idx+1, newstr);
    }
    
    public static void main(String[] args) {
        subsequenceOfStr("abc", 0, "");
    }
}
