import java.util.Arrays;

/*public class productArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] narr = new int[arr.length];
        int mul = 1;
        for(int i =0;i<arr.length;i++) {
            mul = mul*arr[i];
        }
        for(int i=0;i<arr.length;i++){
            narr[i]= mul/arr[i];
        }
        System.out.println(Arrays.toString(narr));
    }
}
*/
 public class productArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] narr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int mul=1;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    mul = mul *arr[j];
                }
            }
            narr[i] = mul;
        }
        System.out.println(Arrays.toString(narr));
    }
}
