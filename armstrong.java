import java.util.Scanner;
public class armstrong{
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp, rem;
        int sum = 0;
        temp = num;
        while(num!= 0){
            rem = num%10;
            sum = sum + rem*rem*rem;
            num = num/10;
        }
        if(temp==sum){
            System.out.println(temp+" is an armstrong number");
        }
        else{
            System.out.println(temp+" is not an armstrong number");
        }
    }
}
