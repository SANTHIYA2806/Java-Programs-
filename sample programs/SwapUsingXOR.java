import java.util.Scanner;
public class SwapUsingXOR {
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Before swapping a is "+a+" and b is"+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping a is "+a+" and b is"+b);
    }
}
