class linkedlist{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void InsertAtBeg(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void InsertAtEnd(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newnode;
        }

    }

    public void DeleteAtBeg(int data){
        if(head==null){
            System.out.println("Head is null");
        }
        else{
            head = head.next;
        }
    }

    public void DeleteAtEnd(int data){
        if(head==null){
            System.out.println("List is empty");
        }
        else if(head.next==null){
            head = null;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next=null;
        }
    }
    public void display(){
        if(head == null){
            System.out.println("Head is empty");
        }
        else{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+ " "+ "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args){
        linkedlist list = new linkedlist();
        list.InsertAtBeg(1);
        list.InsertAtBeg(2);
        list.InsertAtEnd(3);
        list.InsertAtEnd(5);
        list.display();

        list.DeleteAtBeg();
        list.display();

        list.DeleteAtEnd()
        list.display();

    }
}
