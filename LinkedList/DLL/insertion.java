package LinkedList.DLL;

public class insertion {

    
    private static Node insertionHead(Node head,int val){
        Node newHead=new Node(val,head,null);
        head.back=newHead;

        return head;
    }

    //inserting before TAIL
    private static Node insertiontail(Node head,int val){
        if(head.next==null){
            return insertionHead(head, val);
        }
        Node tail=head;
        while (tail.next!=null) {
            tail=tail.next;
        }
        Node prev=tail.back;
        Node newtail=new Node(val,head,prev);
        prev.next=newtail;
        tail.back=newtail;
        
        return head;

    }
    //insert before k
    private static Node insertBeforeK(Node head,int k){
        Node temp=head;
        int  cnt=0;
        while (temp!=null) {
            cnt++;
            if(cnt==k) break;
            temp=temp.next;
        }
        Node prev=temp.back;
        Node newNode=new Node(val,tempp,prev);
        prev.next=newNode;
        temp.back=newNode;

        return  head;
    }

}
