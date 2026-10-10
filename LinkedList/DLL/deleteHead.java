package LinkedList.DLL;

//convert arr to dll and then remove he elemt
public class deleteHead {
    private static Node convertARR2DLL(int[] arr){
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i],next1:null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    private static void print(Node head){
        while (head!=null) {
            System.out.println(head.data+" ");
            head=head.next;
        }
    }
    private static Node deleteHead(Node head){
        if (head==null || head.next==null) {
            return null;
        }
        Node prev=head;
        head=head.next;

        head.back=null;
        head.next=null;

        return head;
    }
    public static void main(String[] args){

        int[] arr={12,5,6,7};
        Node head=convertARR2DLL(arr);
        head=deleteHead(head);
        print(head);
    }
}
