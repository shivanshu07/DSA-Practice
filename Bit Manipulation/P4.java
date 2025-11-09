public class P4 {
    //Convert Decimal to Binary
    public static void DecToBin(int a)
    {
        if (a == 0) {
        System.out.println("0");
        return;
        }

        String s = "";
        while(a>0)
        {
            int bit = a&1;
            s = bit + s;
            a = a>>1;
        }

        System.out.println(s);
    }

    //Binary to Decimal
    public static void BinToDec(String a)
    {
        int result = 0;
        for(int i=0;i<a.length();i++)
        {
            result = result*2 + (a.charAt(i) - '0');
        }

        System.out.println(result);
    }

    public static void main(String args[])
    {
        //int a = 8;
        //DecToBin(a);
        BinToDec("1011");
    }
}
