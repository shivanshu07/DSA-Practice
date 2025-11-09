public class P2 {
    //Reverse a String
    public static void reverseString(String s, int idx)
    {
        if(idx==s.length())
        {
            return;
        }

        reverseString(s, idx+1);
        System.out.print(s.charAt(idx));
    }

    public static void main(String[] args) {
        reverseString("abcd", 0);
    }
}
