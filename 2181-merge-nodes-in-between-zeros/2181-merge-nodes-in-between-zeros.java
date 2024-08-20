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
    public ListNode mergeNodes(ListNode head) {
        
        ListNode temp1=head.next;
        int sum;
        ListNode n=null,h=null;
        
        while(temp1!=null){
            
            sum=0;
            ListNode temp2=temp1;
            
            while(temp2.val!=0){
                sum=sum+temp2.val;
                temp2=temp2.next;
            }
            
            if(h==null){
                h=new ListNode(sum);
                n=h;
            }
            else{
                
                ListNode t=new ListNode(sum);
                h.next=t;
                h=t;
            }
            if(temp2.val==0){
            temp1=temp2.next;
            }
        }
        return n;
        
    }
}