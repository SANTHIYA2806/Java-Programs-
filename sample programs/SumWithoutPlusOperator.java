import java.util.Scanner;
public class SumWithoutPlusOperator {
    public static void main(String[] args) {
        System.out.println("Enter your first number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter your second number");
        int b = sc.nextInt();
        while(b!=0){
            int c = a & b;
            a = a ^ b;
            b = c << 1;
        }
        System.out.println("The sum is "+a);
    }
}
