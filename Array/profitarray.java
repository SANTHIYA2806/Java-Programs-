public class profitarray {
    public static void main(String[] args) {
        int[] arr = {40,200,50,60,110};
        int profit = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                profit = profit+arr[i]-arr[i-1];
            }
        }
        System.out.println(profit);
    }
}
