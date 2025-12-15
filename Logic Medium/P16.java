public class P16 {
    public static void isDivisibleBy13(String s)
    {
        int n = s.length();
        if(n%3 != 0)
        {
            for(int i=0;i<3-(n%3);i++)
            {
                s = "0" + s;
            }
        }
        System.out.println(s);

        int sum = 0;
        int j=0;
        int i=s.length();
        while(i > 0)
        {
            int sign = (j % 2 == 0) ? 1 : -1;
            sum += sign*Integer.parseInt(s.substring(i-3, i));
            i=i-3;
            j++;
        }

        System.out.println(sum%13 == 0);
    }

    public static void main(String[] args) {
        isDivisibleBy13("2911285");
        isDivisibleBy13("1253");
        isDivisibleBy13("169");
        isDivisibleBy13("507");
    }
}
