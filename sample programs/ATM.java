import java.util.*;

public class atm_machine {
    public static void main(String[] args) {
        int balance = 10000;
        int pin = 1528;

        int CreditAmount = 0;
        int DepositAmount = 0;

        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your pin : ");
        int password = scanner.nextInt();

        if (password == pin) {
            System.out.println("Enter your name : ");
            name = scanner.next();
            System.out.println("Welcome to our ATM Management System " + name);

            while (true) {
                System.out.print("\n1. Enter 1 to view your current balance\n");
                System.out.print("2. Enter 2 to credit an amount\n");
                System.out.print("3. Enter 3 to deposit an amount\n");
                System.out.print("4. Enter 4 to view your transaction receipt\n");
                System.out.print("5. Enter 5 to exit\n");

                int option;
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.print("Your Current balance is : " + balance);
                        break;
                    case 2:
                        System.out.println("Enter the amount to be credited \n:");
                        CreditAmount = scanner.nextInt();
                        balance = CreditAmount + balance;
                        System.out.println("Your balance after crediting is : " + balance);
                        break;
                    case 3:
                        System.out.println("Enter the amount to be deposited \n:");
                        DepositAmount = scanner.nextInt();
                        if (DepositAmount > balance) {
                            System.out.println("Insufficient balance");
                        } else {
                            DepositAmount = balance - DepositAmount;
                            System.out.println("Your balance after deposited is : " + DepositAmount);
                        }
                        break;
                    case 4:
                        System.out.println("Your current balance is : " + balance);
                        System.out.println("You credited " + CreditAmount);
                        System.out.println("You deposited " + DepositAmount);
                        System.out.println("Thank you for utilizing us! ");
                        break;

                    default:

                        if (option == 5) {
                            System.out.println("Thank you, come again!");
                            break;
                        }
                }
            }
        }
        else{
            System.out.println("Invalid pin.Please enter correct pin");
        }
    }
}
