import java.util.Scanner;
class Studentss {
    int id;
    String name;
    int age;
    String email;
    long number;
    String address;
    String dob;

    Studentss(int id, int age, String name, String email, long number, String address, String dob) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.email = email;
        this.number = number;
        this.address = address;
        this.dob = dob;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Number: " + number);
        System.out.println("Address: " + address);
        System.out.println("Dob: " + dob);
    }
}

public class constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int id = sc.nextInt();
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        System.out.println("Enter Name: ");
        String name = sc.next();
        System.out.println("Enter Email: ");
        String email = sc.next();
        System.out.println("Enter Number: ");
        long number = sc.nextLong();
        System.out.println("Enter Address: ");
        String address = sc.next();
        System.out.println("Enter DOB: ");
        String dob = sc.next();
        Studentss s = new Studentss(id, age, name, email, number, address, dob);
        s.display();
    }
}
