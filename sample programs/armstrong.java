import java.util.Scanner;
public class armstrong{
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp1, rem,temp2;
        int count = 0;
        double sum = 0;
        temp1 = num;
        temp2 = num;
        while (num >0) {
            num = num / 10;
            count++;
        }
        while(temp1!= 0){
            rem = temp1%10;
            sum = (sum + Math.pow(rem,count));
            temp1 = temp1/10;
        }
        if(temp2==sum){
            System.out.println(temp2+" is an armstrong number");
        }
        else{
            System.out.println(temp2+" is not an armstrong number");
        }
    }
}
