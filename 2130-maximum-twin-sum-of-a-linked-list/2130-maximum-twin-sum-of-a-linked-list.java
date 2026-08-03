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
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }


    public ListNode reverse(ListNode head) {
        int mid = count(head) / 2;
        ListNode i = head;
        
         while (mid > 1) {
            
            i = i.next;
             mid--;
         }
    
         ListNode newHead = i.next;
         i.next = null;
         
         ListNode pre = null;
         ListNode curr = newHead;
         
         while (curr != null) {
            ListNode fwd = curr.next;
            curr.next = pre;
            pre = curr;
            curr = fwd;
        }
       
        return pre;

    }

    
    public int pairSum(ListNode head) {
        int nodes=count(head);
        if(nodes==2) return head.val+head.next.val;
        ListNode temp1=head;
        ListNode temp2 = reverse(head);
        int max=0;

        while(temp2!=null){
            int sum=0;
            sum=temp1.val+temp2.val;
            max=Math.max(max,sum);
            temp1=temp1.next;
            temp2=temp2.next;
        }

        return max;

    }
}