package LinkedList;

public class EndInsert {

    public Node insertAtEnd(Node head, int x) {
        // code here
        Node newNode=new Node(x);
        if(head==null){
            return newNode;
        }
        Node curr=head;
        
        while(curr.next!=null){
            curr=curr.next;
        }
        
        curr.next=newNode;
        
        return head;
        
    }

}
