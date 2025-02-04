import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n*n;
        System.out.println(a);
        int rem,sum = 0;
        while(a>0){
            rem = a%10;
            sum = sum+rem;
            a = a/10;
        }
        if(sum==n){
            System.out.println(n+" is a neon number");
        }
        else{
            System.out.println(n+" is not a neon number");
        }
    }
}
