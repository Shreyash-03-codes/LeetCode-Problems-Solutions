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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        int n1=0;
        while(temp!=null){
            n1++;
            temp=temp.next;
        }
        temp=headB;
        int n2=0;
        while(temp!=null){
            n2++;
            temp=temp.next;

        }

        if(n1<n2){
            while(n2!=n1){
                headB=headB.next;
                n2--;
            }
        }
        else {
            while(n2!=n1){
                headA=headA.next;
                n1--;
            }
        }
        while(headA!=null && headB!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;

        }
        return null;
        
    }
}