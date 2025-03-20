import java.util.Arrays;
import  java.util.Scanner;
public class RemoveAllOccurence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter your Occurence value to be removed");
        int key = sc.nextInt();
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=key){
                arr[j] = arr[i];
                j++;
            }
        }
        for (int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
