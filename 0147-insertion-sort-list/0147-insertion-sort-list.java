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
    public ListNode insertionSortList(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }

        ListNode curr=head;

        ListNode dummy=new ListNode(-1);

        dummy.next=head;

        while(curr.next!=null){

            if(curr.val<=curr.next.val){
                curr=curr.next;
            }
            else{

                ListNode temp=curr.next;

                curr.next=curr.next.next;

                ListNode prev=dummy;

                while(prev.next.val<=temp.val){
                    prev=prev.next;
                }

                temp.next=prev.next;
                prev.next=temp;
            }
        }

        return dummy.next;
        
    }
}