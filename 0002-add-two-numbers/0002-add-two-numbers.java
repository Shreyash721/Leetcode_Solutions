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
        ListNode d=new ListNode(-1);
        ListNode t=d;

        int sum;
        int carry=0;

        while(l1!=null || l2!=null){

            sum=0;
            
            int L1=0,L2=0;
            if(l1!=null) L1=l1.val;
            if(l2!=null) L2=l2.val;

            sum=L1+L2+carry;

            carry=sum/10;

            t.next=new ListNode(sum%10);
            t=t.next;

            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;

        }

        if(carry>0){
            t.next=new ListNode(carry);
        }

        return d.next;
    }
}