package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Basics1 {
    public  static void printList(Node head){
        Node temp=head; //started from head
        
        while (temp!=null) {
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // 1. Create two independent nodes
        Node firstNode = new Node(10);
        Node secondNode = new Node(20);

        // 2. Link them together
        firstNode.next = secondNode;

        // 3. Set the Head of the list
        Node head = firstNode;

        printList(head);
    }
}

