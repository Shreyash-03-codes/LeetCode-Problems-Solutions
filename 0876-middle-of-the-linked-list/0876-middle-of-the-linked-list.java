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
    public ListNode middleNode(ListNode head) {

        ListNode temp1=head;
        ListNode temp2=head;

        int size=0;
        while(temp1!=null){

            size++;
            temp1=temp1.next;

        }

        size=size/2;

        int i=1;

        while(i<=size){

            temp2=temp2.next;
            i++;

        }
        
        head=temp2;

        return head;
    }
}