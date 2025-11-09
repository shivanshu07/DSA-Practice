import java.util.*;

/*
 Swap two numbers
 */

public class P4 {
    //Approach 1: Using third variable {O(1), O(1)}
    public static void swap1(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: "+ a + ", b:"+ b);
    }

    //Approach 2: Using arithmetic operators {O(1), O(1)}
    public static void swap2(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: "+ a + ", b:"+ b);
    }

    //Approach 3: Using bitwise XOR {O(1), O(1)}
    public static void swap3(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: "+ a + ", b:"+ b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers");
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        
        System.out.println("The numbers swapped:");
        swap1(a, b);

        System.out.println("\nUsing arithmetic operators:");
        System.out.println("The numbers swapped:");
        swap2(a, b);

        System.out.println("\nUsing XOR:");
        System.out.println("The numbers swapped:");
        swap3(a, b);

        sc.close();
    }
}
