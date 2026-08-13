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
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public int[] nextLargerNodes(ListNode head) {
        int n=count(head);
        int[] arr= new int[n];
        int [] nge=new int[n];
        Stack<Integer> st= new Stack<>();
        ListNode temp=head;
        for(int i=0;i<n;i++){
            arr[i]=temp.val;
            if(temp!=null) temp=temp.next;
        }

        st.push(arr[n-1]);
        nge[n-1]=0;
        for(int i=n-2;i>=0;i--){

            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                nge[i]=0;
            }
            else nge[i]=st.peek();


            st.push(arr[i]);
        }


        return nge;
    }
}