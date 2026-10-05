package LinkedList.Mergesort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import LinkedList.ListNode;
import OOP.generics.Arraylist;
import OOP.polymorphism.number;

public class deleteDuplicates {

     ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode prev=dummy;
        private ListNode head;
        ListNode curr=head;

        while(curr!=null){
            if(curr.next!=null && curr.val==curr.next.val){
                while(curr.next!=null && curr.val==curr.next.val){
                    curr=curr.next;
                }
                prev.next=curr.next;
            }
            else{
                prev=prev.next;
            }
            curr=curr.next;
        }
        return dummy.next;
    }
}