/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode heada, ListNode headb) {
        ListNode temp1=heada;
        ListNode temp2=headb;
        if(heada==null || headb==null) return null;

        int n=0,m=0;
        while (temp1!=null){
            m++;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            n++;
            temp2 = temp2.next;
        }
        int max=m>n?m:n;
        System.out.println(max);
        int diff=Math.abs(m-n);

        ListNode tempa=heada;
        ListNode tempb=headb;
        if(max==m){
            while(diff>0){
                tempa=tempa.next;
                diff--;
            }
        }

        else if(max==n){
            while(diff>0){
                tempb=tempb.next;
                diff--;
            }
        }

        while(tempa!=tempb){
            tempa=tempa.next;
            tempb=tempb.next;
        }
        return tempa; 
    }
}