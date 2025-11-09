public class P5 {
    //Replace all x's to the end of the str
    public static void replaceX(String s, int count, int idx, String newstr)
    {
        if(idx == s.length())
        {
            for(int i=0;i<count;i++)
            {
                newstr = newstr + 'x';
            }
            System.out.println(newstr);
            return;
        }

        char cur = s.charAt(idx);
        if(cur == 'x')
        {
            count++;
        }
        else{
            newstr = newstr + cur;
        }

        replaceX(s, count, idx+1, newstr);
    }

    public static void main(String[] args) {
        replaceX("abxxcdxx", 0, 0, "");
    }
}
