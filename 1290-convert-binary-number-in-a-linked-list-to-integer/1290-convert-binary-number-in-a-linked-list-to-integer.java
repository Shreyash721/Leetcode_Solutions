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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int c=0;
        double sum=0;
        while(temp.next!=null){
            c++;
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            sum=sum+temp.val*Math.pow(2,c);
            c--;
            temp=temp.next;
        }

        return (int)sum;

    }
}