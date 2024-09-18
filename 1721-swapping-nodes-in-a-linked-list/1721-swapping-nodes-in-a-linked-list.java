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
    public ListNode swapNodes(ListNode head, int k) {

        if(head==null){

            return null;

        }

        ListNode temp1=head;

        int i=1;

        while(i<k){

            temp1=temp1.next;
            i++;

        }

        ListNode temp2=head;
        int size=0;

        while(temp2!=null){

            size++;
            temp2=temp2.next;

        }

        ListNode temp3=head;
        int j=1;

        while(j<size-k+1){

            temp3=temp3.next;
            j++;

        }

        
        int temp=temp1.val;

        temp1.val=temp3.val;

        temp3.val=temp;

        return head;
    }
}