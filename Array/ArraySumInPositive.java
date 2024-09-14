import java.util.Scanner;
import java.math.*;
public class ArraySumInPositive {
    public static void main(String[] args) {
        int i,sumodd =0,sumeven =0,difference;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int[a];
        for ( i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < a; i++) {
            if (arr[i] % 2 == 0) {
                sumeven = sumeven + arr[i];
            }
            else {
                sumodd = sumodd + arr[i];
            }
        }
        System.out.println(sumeven);
        System.out.println(sumodd);
        difference = sumeven - sumodd;
        if(difference <0){
            System.out.println(Math.abs(difference));
        }
        else{
            System.out.println(difference);
        }
   }
}
