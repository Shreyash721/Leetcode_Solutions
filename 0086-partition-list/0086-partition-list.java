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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1=new ListNode(-1);
        ListNode dummy2=new ListNode(-1);
        ListNode t1=dummy1;
        ListNode t2=dummy2;

        while(head!=null){

            ListNode nextHead=head.next;
            head.next=null;
            if(head.val<x){
                t1.next=head;
                t1=t1.next;
            }
            else{
                t2.next=head;
                t2=t2.next;
            }
            
            head=nextHead;
        }

        ListNode i=dummy1;
        while(i.next!=null){
            i=i.next;
        }

        i.next=dummy2.next;

        return dummy1.next;
    }
}