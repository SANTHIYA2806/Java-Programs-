import java.util.Scanner;
public class StringDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch =new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        int[] farr = new int[257];
        for (int i = 0; i < s.length(); i++) {
            farr[ch[i]]++;
        }
        System.out.print("The unique elements in the string are ");
        for (int i = 0; i < 257; i++) {
            if (farr[i] ==1) {
                System.out.print((char)i);
            }
        }
    }
}
