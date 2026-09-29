package LinkedList;

public class ArrtoLL {

    Node build(int[] arr,int i){
        if(i==arr.length){
            return null;
        }
        
        Node head=new Node(arr[i]);
        head.next=build(arr,i+1);
        
        return head;
    }
    public Node arrayToList(int arr[]) {
        // code here
        return build(arr,0);
    }
}

