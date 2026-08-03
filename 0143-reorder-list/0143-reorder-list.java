class Solution {

    public int count(ListNode head){
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }

    public ListNode reverseIbreak(ListNode head){
        int node=count(head);
        int mid=node/2;

        ListNode i=head;
        while(mid>0){
            i=i.next;
            mid--;
        }

        ListNode newHead=i.next;
        i.next=null;

        ListNode prev=null;
        ListNode curr=newHead;

        while(curr!=null){
            ListNode fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }

        return prev;
    }

    public void reorderList(ListNode head) {

        if(head==null || head.next==null)
            return;

        ListNode temp1=head;
        ListNode temp2=reverseIbreak(head);

        ListNode curr1=temp1;
        ListNode curr2=temp2;

        while(curr1!=null && curr2!=null){

            ListNode fwd1=curr1.next;
            ListNode fwd2=curr2.next;

            curr1.next=curr2;
            curr2.next=fwd1;

            curr1=fwd1;
            curr2=fwd2;
        }
    }
}