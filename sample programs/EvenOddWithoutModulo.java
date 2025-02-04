import java.util.Scanner;
public class EvenOddWithoutModulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        String[] arr = new String[]{"Even","Odd"};
        System.out.println(arr[num&1]);
    }
}
