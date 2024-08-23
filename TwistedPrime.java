import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class TwistedPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0, rev = 0;
        if (n <= 1) {
            System.out.println(n + " is not a prime number");
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(n + " is not a prime number");
            } else {
                System.out.println(n + " is a prime number");
            }
            while (n > 0) {
                int rem = n % 10;
                rev = rev * 10 + rem;
                n /= 10;
            }
            System.out.println(rev);
            int count1 = 0;
            for (int i = 2; i <= rev / 2; i++) {
                if (rev % i == 0) {
                    count1++;
                }
            }
            if (count1 > 0) {
                System.out.println(rev + " is not a twisted prime number");
            } else {
                System.out.println(rev + " is a twisted prime number");
            }
        }
    }
}
