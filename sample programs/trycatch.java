import java.util.Scanner;
class Sri extends Exception{
    Sri(){
        super("cute");
    }
    Sri(String s){
        super(s);
    }
}
public class trycatch {
    public static void valid(int age) throws Sri {
        if (age < 18) {
            throw new Sri("hello");
        } else {
            System.out.println("Valid");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            valid(age);
        } catch (Sri s) {
            System.out.println(s.getMessage());
        }
    }
}
