import java.util.Scanner;
import java.util.Arrays;
public class PrintArray {
    public static void main(String[] args) {
        int i;
        System.out.print("Enter the size of the array ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(arr));
    }
}
