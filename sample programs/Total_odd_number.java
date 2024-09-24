import java.util.Scanner;
public class Total_odd_number {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            if(i%2!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}
