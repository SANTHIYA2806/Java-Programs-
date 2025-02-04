import java.util.Scanner;
public class SwapString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str   = s.split(" ");
        String temp;
        for(int i=0;i<str.length;i++){
            temp = str[0];
            str[0] = str[1];
            str[1] = temp;
        }
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+ " ");
        }
    }
}
