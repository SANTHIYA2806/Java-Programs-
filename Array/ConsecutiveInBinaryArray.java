import java.util.*;
public class ConsecutiveInBinaryArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        int zero = 0, maxzero = 0;
        int one = 0, maxone = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
                maxzero = Math.max(zero,maxzero);
                one = 0;
            }
            else{
                one++;
                maxone = Math.max(one,maxone);
                zero = 0;
            }
        }
        System.out.println(maxone);
        System.out.println(maxzero);
    }
}
