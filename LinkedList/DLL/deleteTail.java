package LinkedList.DLL;

public class deleteTail {
    public  static Node deletetail(Node head){
        if(head==null ||head.next==null){
            return null;
        }
        Node tail=head;
        while (tail.next!=null) {
            tail=tail.next;
        }
        Node newtail=tail.back;
        newtail.next=null;
        newtail.back=null;
        return head;

    }
}
