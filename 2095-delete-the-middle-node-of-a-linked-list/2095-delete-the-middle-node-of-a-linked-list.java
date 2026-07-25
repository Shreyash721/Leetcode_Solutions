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
    int c=0;
    int middle;
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode temp=head;
        ListNode t=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        middle=c/2;
      
        for(int i=0;i<middle-1;i++){
            t=t.next;
        }
        t.next=t.next.next;

        return head;
    }
}