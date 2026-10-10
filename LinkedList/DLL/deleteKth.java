package LinkedList.DLL;

public class deleteKth {
    
    public static Node deletetail(Node head){
        if (head == null || head.next == null){
            return null;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node newtail = tail.back;
        newtail.next = null;
        tail.back = null;
        return head;
    }

    private static Node deleteHead(Node head){
        if (head == null || head.next == null) {
            return null;
        }
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
    }

    public static Node removeKth(Node head, int k){
        if (head == null) {
            return null;
        }
        
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            if (cnt == k) break;
            temp = temp.next; 
        }
        
        if (temp == null) {
            return head;
        }
        
        Node prev = temp.back;
        Node front = temp.next;
        if (prev == null && front == null) {
            return null;
        }
        else if (prev == null) {
            return deleteHead(head);
        } 
        else if (front == null) {
            return deletetail(head);
        }
        
        // If it's a middle node
        prev.next = front;
        front.back = prev;
        temp.next = null;
        temp.back = null;
        
        return head;
    }
}
