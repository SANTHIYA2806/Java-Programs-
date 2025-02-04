import java.util.Scanner;
import java.lang.String;
public class SubstringPrint {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '@'){
                i=i+1;
                for(;i<s.length();i++){
                    System.out.print(s.charAt(i));
                }
            }
        }
    }
}
