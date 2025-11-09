public class P4 {
    //No of ways to invite n people, either single or in pair
    public static int invitePeople(int n)
    {
        if(n <= 1)
        {
            return 1;
        }

        //remaining people as single
        int single = invitePeople(n-1);

        //remaining people as pairs
        int pair = (n-1)*invitePeople(n-2);

        return single + pair;
    }
    public static void main(String[] args) {
        System.out.println(invitePeople(4));
    }
}
