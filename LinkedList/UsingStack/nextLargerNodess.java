package LinkedList.UsingStack;

import java.util.ArrayList;

import LinkedList.ListNode;

public class nextLargerNodess {
    public  int[] nextLargerNodes(ListNode head){
        ArrayList<Integer> ans=new ArrayList<>();
        ListNode curr=head;

        while(curr!=null){
            int greater=0;
            ListNode temp=curr.next;
            while (temp!=null) {
                if(temp.val>curr.val){
                    greater=temp.val;
                    break;
                }
                temp=temp.next;
            }
            ans.add(greater);
            curr=curr.next;
        }
            int[] result=new int[ans.size()];
            for(int i=0;i<ans.size();i++){
                result[i]=ans.get(i);
            }
    }
}
