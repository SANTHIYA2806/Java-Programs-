import java.util.Scanner;
public class panagram {
    public static void main(String[] args) {
        int i, j,count=0;
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();

        char[] freq = new char[26];
        for(i=0;i<s.length();i++){
                freq[s.charAt(i)-'a']++;
        }
        for(j=0;j<=26;j++){
            if(freq[j]>0){
                count++;
            }
        }
        if(count==26){
            System.out.println("It is a panagram");
        }
        else{
            System.out.println("It is not a panagram");
            for(j=0;j<26;j++){
                if(freq[j]==0) {
                    int ch = j + 'a';
                    char m = (char) ch;
                    System.out.print(m + " ");
                }
            }
        }
    }
}
