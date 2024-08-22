import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your seat no");
        Scanner sc = new Scanner(System.in);
        int seatNo = sc.nextInt();
        int CompartmentSeat = 8;
        int totalseats = 72;
        if (totalseats < seatNo) {
            System.out.println("Your seat no exceeds");
        } else {
            int no = seatNo % CompartmentSeat;
            switch (no) {
                case 1:
                case 4:
                    System.out.println("Upper berth");
                    break;
                case 2:
                case 5:
                    System.out.println("middle berth");
                    break;
                case 3:
                case 6:
                    System.out.println("Lower berth");
                    break;
                case 7:
                    System.out.println("side lower");
                    break;
                case 0:
                    System.out.println("side upper");
                    break;
                default:
                    System.out.println("Invalid seat no");
                    break;
            }
        }
    }
}
