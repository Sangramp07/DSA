package LinkedList.UsingStack.hashmap;

import java.util.Stack;

import LinkedList.ListNode;

public class removeNodes {
     public ListNode partition(ListNode head, int x) {
        if (head == null) return null;

        ListNode smalldummy=new ListNode(0);
        ListNode largedummy=new ListNode(0);
        ListNode small=smalldummy;
        ListNode large=largedummy;

        ListNode curr=head;


        while(curr!=null){
            if(ListNode.val<x){
                small.next=curr;
                small=small.next;
            }
            else{
                large.next=curr;
                large=large.next;
            }
            curr=curr.next;
        }
        small.next=largedummy.next;
        large.next=null;

        return smalldummy.next;
    }
}