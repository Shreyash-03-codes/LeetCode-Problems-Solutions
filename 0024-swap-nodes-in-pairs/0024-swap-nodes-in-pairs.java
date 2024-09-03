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
    public ListNode swapPairs(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }

        ListNode dummy=new ListNode(0);

        dummy.next=head;

        ListNode copy=dummy;
       
        while(copy.next!=null && copy.next.next!=null){

            ListNode temp1=copy.next;
            ListNode temp2=copy.next.next;

            temp1.next=temp2.next;
            copy.next=temp2;
            copy.next.next=temp1;
            copy=copy.next.next;

        }

        return dummy.next;
        
    }
}