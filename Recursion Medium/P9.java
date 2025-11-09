public class P9 {
    public static String[] map = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    //Get corresponding letter combinations for each number entered on the keypad
    public static void letterCombinations(String s, int idx, String newstr)
    {
        if(idx == s.length())
        {
            System.out.println(newstr);
            return;
        }

        char curNum = s.charAt(idx);
        String mappedStr = map[curNum - '0'];
        for(int i=0;i<mappedStr.length();i++)
        {
            letterCombinations(s, idx+1, newstr+mappedStr.charAt(i));
        }
    }
    public static void main(String[] args) {
        letterCombinations("22", 0, "");
    }
}
