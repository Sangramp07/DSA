package LinkedList;

public class deletion {
    Node deleteNode(Node head,int x){
        if(head==null) return null;
        if(x==1){
            return head.next;
        }
        Node curr=head;
        for(int i=1;i<=x-2;i++){
            curr=curr.next;
        }
        if(curr!=null && curr.next!=null){
            curr.next=curr.next.next;
        }
        return head;
    }
}
