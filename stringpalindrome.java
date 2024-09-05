import java.util.Scanner;
public class stringpalindrome {
    public static void main(String[] args) {
        int i,j=-0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chstr = s.toCharArray();
        char[] charr = new char[s.length()];
        for( i=s.length()-1;i>=0;i--){
            charr[j] = chstr[i];
            j++;
        }
        String str = new String(charr);
        if(str.equals(s)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
