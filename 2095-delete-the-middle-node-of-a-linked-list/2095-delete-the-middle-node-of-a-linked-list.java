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
    public ListNode deleteMiddle(ListNode head) {

        if(head==null ){
            return head;
        }
        if(head.next==null){
            return null;
        }

        ListNode temp=head;
        int size=0;

        while(temp!=null){
            temp=temp.next;
            size++;
        }

        ListNode t=head;
        ListNode t2=head.next;

        size=size/2;
        size=size+1;

        int i=1;

        while(i<size-1 && t2.next!=null){
            t=t.next;
            t2=t2.next;
            i++;
        }

        t.next=t2.next;

        return head;
        
    }
}