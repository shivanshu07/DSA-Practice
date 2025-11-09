public class P6 {
    public static boolean[] map = new boolean[26];

    //Remove duplicates from a str
    public static void removeDup(String s, int idx, String newstr)
    {
        if(idx == s.length())
        {
            System.out.println(newstr);
            return;
        }
        char cur = s.charAt(idx);
        if(!map[cur - 'a'])
        {
            newstr = newstr + cur;
            map[cur - 'a'] = true;
        }

        removeDup(s, idx+1, newstr);
    }
    public static void main(String[] args) {
        removeDup("aabbcc", 0, "");
    }
}
