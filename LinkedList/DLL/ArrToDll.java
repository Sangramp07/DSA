package LinkedList.DLL;

import OOP.polymorphism.number;

class Node{
    int data;
    Node next;
    public Object back;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
    public Node(int i, Object object, Node prev) {
        //TODO Auto-generated constructor stub
    }
    public Node(int i, Object object, Node prev) {
        //TODO Auto-generated constructor stub
    }
    public Node(int i, Object object, Node prev) {
        //TODO Auto-generated constructor stub
    }
}
public class ArrToDll {
    private static Node converArr2LL(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    private static int lengthOfLL(Node head){
        int cnt=0;
        Node temp=head;
        while (temp!=null) {
            temp=temp.next;
            cnt++;
        }
        return cnt;
    }
    private static void print(Node head){
        while (head!=null) {
            System.out.println(head.data+" ");
            head=head.next;
        }
    }
}
