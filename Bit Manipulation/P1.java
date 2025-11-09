class P1{
    //Get Bit
    public static void getBit(int n, int pos)
    {
        int bitMask = 1<<pos;
        int newNum = n & bitMask;
        if(newNum == 0){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }

    //Set Bit
    public static void setBit(int n, int pos)
    {
        int bitMask = 1<<pos;
        int newNum = n | bitMask;
        System.out.println(newNum);
    }

    //Clear Bit
    public static void clearBit(int n, int pos)
    {
        int bitMask = 1<<pos;
        int newNum = n & ~bitMask;
        System.out.println(newNum);
    }

    public static void main(String[] args){
        int n=5;
        int pos=2;

        getBit(n, pos);
        setBit(n, pos);
        clearBit(n, pos);
    }
}