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
    int c=1;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        if(head==null || head.next==null) return null;
        while(temp.next!=null){
            c++;
            temp=temp.next;
        }
        int num=c-n;
        ListNode t=head;
        if(num==0){
            t.val=t.next.val;
        }
        for(int i=0;i<num-1;i++){
            t=t.next;
        }
        t.next=t.next.next;

    return head;
    }
}