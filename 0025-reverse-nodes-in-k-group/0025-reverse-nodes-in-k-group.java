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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode next=null;
        ListNode prev=null;
        ListNode curr=head;
        int i=k;
        
        while(curr!=null && i>0){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            i--;
        }
        
        if(i>0){
            ListNode next1=null;
            ListNode prev1=null;
            ListNode curr1=prev;
            while(curr1!=null ){
                next1=curr1.next;
                curr1.next=prev1;
                prev1=curr1;
                curr1=next1;
            
            }
            return prev1;
        }
        else{
            head.next=reverseKGroup(next,k);
        }
        
        return prev;
        
    }
}