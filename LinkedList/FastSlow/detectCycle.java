package LinkedList.FastSlow;

import LinkedList.ListNode;

public class detectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                ListNode newNode=head;
                while(slow!=newNode){
                    slow=slow.next;
                    newNode=newNode.next;
                }
                return newNode;
            }
        }
        return null;
    }
    }

