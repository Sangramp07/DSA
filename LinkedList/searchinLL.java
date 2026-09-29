package LinkedList;

public class searchinLL {
    public boolean searchKey(Node head, int key) {
        // Code here
        Node curr=head;
        while(curr!=null){
            if(curr.data==key){
                return true;
                
            }
            curr=curr.next;
        }return false;
    }
}
