import java.util.Scanner;
import java.util.Arrays;
public class LargestElement {
    public static void main(String[] args) {
        int i;
        System.out.print("Enter the size of the array ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("The largest element in the array is " +arr[n-1]);
    }
}
