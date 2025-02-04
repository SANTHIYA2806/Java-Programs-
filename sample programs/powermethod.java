import java.util.Scanner;
public class powermethod {
    public static int power(int base, int exp) {
        int result = 1;
        while (exp > 0) {
            result =  result * base;
            exp--;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exp = sc.nextInt();
        System.out.println(power(base, exp));
    }
}
