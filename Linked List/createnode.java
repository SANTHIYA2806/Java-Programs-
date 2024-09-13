import java.util.*;
class Node{
    int data;
    Node next;
}
public class createnode {
    Node head;

    void Create(int n) {
        Node temp, newnode;
        head = new Node();
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        head.data = data;
        head.next = null;
        temp = head;
        for (int i = 1; i < n; i++) {
            newnode = new Node();
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ds s = new ds();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        s.Create(n);
        s.display();
    }
}

