import java.util.*;
import java.util.Arrays;
public class SortDescending{
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        Integer[] arr = new Integer[length];

        for(i=0;i<length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
