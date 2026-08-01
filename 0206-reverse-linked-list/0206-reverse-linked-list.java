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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev=null;
        ListNode t=head;
        ListNode t1=head.next;

        while(t1!=null){
            t.next=prev;
            prev=t;
            t=t1;
            t1=t1.next;
        }
        t.next=prev;
        prev=t;


        return prev;

    }
}