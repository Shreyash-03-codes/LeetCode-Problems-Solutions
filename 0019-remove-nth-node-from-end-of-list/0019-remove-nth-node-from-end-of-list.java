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
    public ListNode removeNthFromEnd(ListNode head, int n)  {

        if(head==null || head.next==null){

            return null;

        }
        int size=0;
        
        ListNode temp=head;

        while(temp!=null){

            temp=temp.next;
            size++;

        }

        if(size==n){

            head=head.next;
            return head;
            
        }

        ListNode temp1=head;
        ListNode temp2=head.next;

        int i=1;

        while(i<size-n && temp2.next!=null){
            
            temp1=temp1.next;
            temp2=temp2.next;
            i++;
            
        }

        temp1.next=temp2.next;

        return head;
        
        
    }
}