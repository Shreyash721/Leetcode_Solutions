class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        ListNode list1 = head;

        while (list1 != null && list1.next != null) {

            if (list1.val != list1.next.val) {

                temp.next = list1;
                temp = list1;
                list1 = list1.next;
            } else {

                ListNode list2 = list1.next;

                while (list2 != null && list2.val == list1.val) {
                    list2 = list2.next;
                }

                list1 = list2;
            }
        }

        if (list1 != null) {
            temp.next = list1;
            temp = temp.next;
        }

        temp.next = null;

        return dummy.next;
    }
}