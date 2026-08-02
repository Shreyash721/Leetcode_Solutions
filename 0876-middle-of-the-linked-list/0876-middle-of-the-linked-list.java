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
    public ListNode middleNode(ListNode head) {
        ListNode i=head;
        int c=0;
        while(i!=null){
            c++;
            i=i.next;
        }
        int mid=c/2;
        i=head;
        while(mid>0){
            i=i.next;
            mid--;
        }

        head=i;

        return head;


    }
}