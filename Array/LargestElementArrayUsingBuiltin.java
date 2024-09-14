import java.util.Scanner;
import java.util.Arrays;
public class LargestElementArrayUsingBuiltin {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
    }
}
