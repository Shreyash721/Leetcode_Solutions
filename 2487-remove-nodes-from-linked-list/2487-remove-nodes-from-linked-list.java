class Solution {
    public ListNode removeNodes(ListNode head) {
        if(head==null || head.next==null) return head;

        head = reverse(head); 

        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        ListNode temp=head;
        int a=temp.val;
        ListNode a1=temp;
        t.next=a1;
        t=t.next;
        temp=temp.next;

        while(temp!=null){
            if(temp.val>=a){
                t.next=temp;
                t=t.next;
                a=temp.val;
            }
            temp=temp.next;
        }
        t.next=null;

        return reverse(dummy.next); 
    }

    private ListNode reverse(ListNode node){
        ListNode prev=null;
        while(node!=null){
            ListNode nxt=node.next;
            node.next=prev;
            prev=node;
            node=nxt;
        }
        return prev;
    }
}