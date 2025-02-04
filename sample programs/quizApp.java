import java.util.Scanner;
public class quizApp {
    public static void main(String[] args) {
        Q_A questions = new Q_A();
        Q_A answers = new Q_A();
        Scanner input = new Scanner(System.in);
        char ans;
        int correct = 0;
        int wrong = 0;
        questions.question1();
        ans = input.next().charAt(0);
        if(ans == answers.answer1){
            correct++;
        }
        else{
            wrong++;
        }
        questions.question2();
        ans = input.next().charAt(0);
        if(ans == answers.answer2){
            correct++;
        }
        else{
            wrong++;
        }
        questions.question3();
        ans = input.next().charAt(0);
        if(ans == answers.answer3){
            correct++;
        }
        else{
            wrong++;
        }
        questions.question4();
        ans = input.next().charAt(0);
        if(ans == answers.answer4){
            correct++;
        }
        else{
            wrong++;
        }
        questions.question5();
        ans = input.next().charAt(0);
        if(ans == answers.answer5){
            correct++;
        }
        else{
            wrong++;
        }

        double correct_answer = correct;
        double percentage = (correct_answer*20)/100;

        System.out.println("Your marks out of 100 is "+correct*20);
        System.out.println("Correct Answers are "+correct + "/n your wrong Answers are "+wrong);

    }
}
class Q_A{
    void question1(){
        System.out.println("1) Which of the following option leads to the portability and security of Java?\n" +
                "\n" +
                "a) Bytecode is executed by JVM\n" +
                "b) The applet makes the Java code secure and portable\n" +
                "c) Use of exception handling\n" +
                "d) Dynamic binding between objects");
    }
    void question2(){
        System.out.println("2) Which of the following is not a Java features?\n" +
                "\n" +
                "a) Dynamic\n" +
                "b) Architecture Neutral\n" +
                "c) Use of pointers\n" +
                "d) Object-oriented");
    }
    void question3(){
        System.out.println("3) The \\u0021 article referred to as a\n" +
                "\n" +
                "a) Unicode escape sequence\n" +
                "b) Octal escape\n" +
                "c) Hexadecimal\n" +
                "d) Line feed");
    }
    void question4(){
        System.out.println("4) _____ is used to find and fix bugs in the Java programs.\n" +
                "\n" +
                "a) JVM\n" +
                "b) JRE\n" +
                "c) JDK\n" +
                "d) JDB");
    }
    void question5(){
        System.out.println("5) Which of the following is a valid declaration of a char?\n" +
                "\n" +
                "a) char ch = '\\utea';\n" +
                "b) char ca = 'tea';\n" +
                "c) char cr = \\u0223;\n" +
                "d) char cc = '\\itea';");
    }
    char answer1 = 'a';
    char answer2 = 'c';
    char answer3 = 'a';
    char answer4 = 'd';
    char answer5 = 'a';
}
