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

        if(headA==null || headB==null){
            return null;
        }

        if(headA==headB){
            return headB;
        }

        ListNode temp1=headA;

        int a=0;

        while(temp1!=null){
            temp1=temp1.next;
            a++;
        }

        ListNode temp2=headB;

        int b=0;

        while(temp2!=null){
            temp2=temp2.next;
            b++;
        }

        temp1=headA;
        temp2=headB;

        while(a!=b){

            if(a>b){
                temp1=temp1.next;
                a--;
            }
            else{
                temp2=temp2.next;
                b--;
            }
        }

        while(temp1!=null && temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        
        return null;
    }
}