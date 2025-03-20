import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = { 1,2,6,3,6,4,2};
        System.out.println(arr.length);
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int[] temps = new int[arr.length];
        int j = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                temps[j++] = arr[i];
            }
        }
        temps[j++] = arr[arr.length-1];
        for (int i=0;i<j;i++){
            System.out.println(temps[i]+" ");
        }
    }
}
