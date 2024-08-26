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
    public boolean isPalindrome(ListNode head) {

        if(head==null){

            return true;

        }
        if(head.next==null){

            return true;

        }
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;
            
        }

        ListNode prev=null;
        ListNode temp;

        while(slow!=null){

            temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;

        }

        while(prev!=null){

            if(head.val!=prev.val ){

                return false;

            }

            prev=prev.next;
            head=head.next;
        }

        return true;

    }
}