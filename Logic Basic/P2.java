import java.util.*;

/*
 To print table of n
 */
public class P2 {
    //Approach 1: Iterative method {O(1), O(1)}
    public static void printTable1(int n){
        for(int i = 1;i<=10;i++)
        {
            System.out.println(i*n);
        }
    }

    //Aproach 2: Recursive method {O(1), O(1)}
    public static void printTable2(int n, int i){
        if(i == 11){
            return;
        }

        System.out.println(n*i);
        printTable2(n, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Table of "+ n);
        printTable1(n);

        System.out.println("Recursive Way:");
        printTable2(n, 1);

        sc.close();
    }
}
