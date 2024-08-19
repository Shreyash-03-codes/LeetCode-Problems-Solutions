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
    public ListNode removeNodes(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }

        ListNode p=null;
        ListNode c=head;
        while(c!=null){

            ListNode temp=c.next;
            c.next=p;
            p=c;
            c=temp;
        }

        head=p;
        ListNode curr=head.next;
        ListNode ptr=head;

        while(curr!=null){

            if(curr.val<ptr.val){
               
                curr=curr.next;
                
            }
            else{
           
                ListNode temp=curr.next;
                curr.next=ptr;
                ptr=curr;
                curr=temp;
            }
            
         
        }

           head.next=null;
            head=ptr;
            return head;

    }

}