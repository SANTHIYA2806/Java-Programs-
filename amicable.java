import java.util.Scanner;
public class amicable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        int sum1=0,sum2 = 0;
        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0) {
                sum1 = sum1 + i;
            }
        }
        for(int i = 1;i<num1;i++){
            if(num1%i==0){
                sum2 = sum2 + i;
            }
        }
        if(num1==sum1 && num2==sum2){
            System.out.println("It is an Amicable number");
        }
        else{
            System.out.println("It is not an Amicable number");
        }

    }
}
