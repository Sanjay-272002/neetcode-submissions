/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode result=new ListNode(0);
        ListNode res=result;
        int quo=0;
        while(l1!=null && l2!=null){
            int sum=l1.val+l2.val+quo;
            int rem=sum%10;
            quo=sum/10;
            ListNode nw=new ListNode(rem);
            res.next=nw;
            res=res.next;  
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int sum=l1.val+quo;
            int rem=sum%10;
            quo=sum/10;
            ListNode nw=new ListNode(rem);
            res.next=nw;
            l1=l1.next;
            res=res.next;
        }
        while(l2!=null){
            int sum=l2.val+quo;
            int rem=sum%10;
            quo=sum/10;
            ListNode nw=new ListNode(rem);
            res.next=nw;
            l2=l2.next;
            res=res.next;
        }
        if(quo!=0){
            res.next= new ListNode(quo);
        }
        return result.next;  
    }
}
