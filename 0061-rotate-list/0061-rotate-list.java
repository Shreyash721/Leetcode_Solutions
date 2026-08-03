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

    public int count(ListNode head){
        int c = 0;
        ListNode temp = head;

        while(temp != null){
            c++;
            temp = temp.next;
        }

        return c;
    }

    public ListNode reversefull(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }


    public ListNode reverseIbreak(ListNode head, int k) {

        if(head == null || head.next == null)
            return head;

        int n = count(head);

        k = k % n;

        if(k == 0)
            return head;

      
        int mid = n - k;

        ListNode i = head;

        while(mid > 1){
            i = i.next;
            mid--;
        }

        // break
        ListNode second = i.next;
        i.next = null;

        // join 
        ListNode temp = second;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = head;

        return second;
    }


    public ListNode rotateRight(ListNode head, int k) {

        return reverseIbreak(head, k);

    }
}