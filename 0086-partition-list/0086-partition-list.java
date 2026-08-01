class Solution {
    public ListNode partition(ListNode head, int x) {

        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);

        ListNode temp1 = dummy1;
        ListNode temp2 = dummy2;

        while (head != null) {
            ListNode next = head.next;
            head.next = null;

            if (head.val < x) {
                temp1.next = head;
                temp1 = temp1.next;
            } else {
                temp2.next = head;
                temp2 = temp2.next;
            }

            head = next;
        }

        temp1.next = dummy2.next;

        return dummy1.next;
    }
}