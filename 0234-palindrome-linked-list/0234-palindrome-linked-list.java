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
        int node=count(head);
        int mid=node/2;

        ListNode i = head;
        
         while (mid > 1) {
            
            i = i.next;
             mid--;
         }

         ListNode newHead;

         if(node%2!=0){
             newHead=i.next.next;
         }
         else{
             newHead = i.next;
         }
        
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
    public boolean isPalindrome(ListNode head) {

        if(head==null || head.next==null) return true;

        ListNode temp1=head;
        ListNode temp2=reverse(head);

        boolean flag=true;

        while(temp2!=null){

            if(temp1.val!=temp2.val){
                flag=false;
            }

            temp1=temp1.next;
            temp2=temp2.next;
        }

        return flag;

    }
}