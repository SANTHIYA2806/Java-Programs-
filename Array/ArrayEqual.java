import java.util.Scanner;
import java.util.Arrays;
public class ArrayEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] a = new int[m];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] b = new int[n];
        for(int i=0;i<b.length;i++){
            b[i] = sc.nextInt();
        }
        boolean result = Arrays.equals(a,b);
        if(result == true){
            System.out.println("Two Arrays are equal");
        }
        else{
            System.out.println("Two Arrays are not equal");
        }
    }
}
