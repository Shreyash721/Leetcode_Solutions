/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode tempa=head;
        ListNode tempb=head;

        while(tempb!=null && tempb.next!=null){
            tempa=tempa.next;
            tempb=tempb.next.next;
            if(tempa==tempb) return true;
        }
        return false;
    }
}