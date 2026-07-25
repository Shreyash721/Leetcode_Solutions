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
    public ListNode swapNodes(ListNode head, int k) {
        int c=1;
        ListNode temp=head;
        while(temp.next!=null){
            c++;
            temp=temp.next;
        }
        int diff=c-k;
        ListNode tempa=head;
        ListNode tempb=head;

        if(head==null || head.next==null){
            return head;
        }
        for(int i=0;i<diff;i++){
            tempa=tempa.next;
        }

        for(int i=0;i<k-1;i++){
            tempb=tempb.next;
        }

        int tempp=tempa.val;
        tempa.val=tempb.val;
        tempb.val=tempp;

        return head;
    }
}