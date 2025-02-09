import java.util.Scanner;
class linkedlist {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev=null;
        }
    }
    Node head = null;

    public void insertAtBeg(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }
    public void insertAtEnd(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    public void insertAtMid(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }
        else{
            Node slow = head;
            Node fast = head.next;
            while(slow!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            newnode.next = slow.next;
            slow.next = newnode;
        }
    }
    public void DeleteAtBeg(){
        if(head == null){
            System.out.println("Empty list");
        }
        else{
            head = head.next;
        }
    }
    public void DeleteAtEnd(){
        Node temp = head;
        if(head==null){
            System.out.println("List is empty");
        }
        else if(head.next==null){
            head = null;
        }
        else{
            while(temp.next.next !=null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    void display() {
        if (head == null) {
            System.out.println("Head is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " " + "-> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insertAtBeg(2);
        list.insertAtBeg(22);
        list.insertAtEnd(44);
        list.insertAtEnd(4);
        list.insertAtMid(3);
        list.display();
    }
}
