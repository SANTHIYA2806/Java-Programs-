import java.util.Scanner;
import java.util.Arrays;
public class ArrayConcate {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array A:-");
        int m = sc.nextInt();
        System.out.print("Enter the elements of array A:-");
        int a[] = new int[m];
        for(i=0;i<m;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter size of array B:-");
        int n = sc.nextInt();
        System.out.print("Enter the elements of array A:-");
        int b[] = new int[n];
        for(i=0;i<n;i++){
            b[i] = sc.nextInt();
        }
        int result[] = new int[a.length+b.length];
        System.arraycopy(a,0,result,0,a.length);
        System.arraycopy(b,0,result,a.length,b.length);

        System.out.print("Array after Concatenation is ");
        System.out.println(Arrays.toString(result));

        System.out.print("Sorting all the elements");
        Arrays.sort(result);
        System.out.print(Arrays.toString(result));
    }
}
