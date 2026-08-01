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
    public ListNode oddEvenList(ListNode head) {

        ListNode d1=new ListNode(90);
        ListNode d2=new ListNode(100);
        ListNode t1=d1;
        ListNode t2=d2;
        ListNode temp=head;
        int index=1;

        while(temp!=null){
            if(index%2==1){
                t1.next=temp;
                t1=temp;
            }
            else{
                t2.next=temp;
                t2=temp;
            }

            temp=temp.next;
            index=index+1;
        }

        t1.next=d2.next;
        t2.next=null;


        return d1.next;

    }
}