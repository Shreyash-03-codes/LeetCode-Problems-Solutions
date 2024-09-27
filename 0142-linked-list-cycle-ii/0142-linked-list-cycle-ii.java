/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head==null){
            return null;
        }
        
        if( head.next==null){
            return null;
        }
        
    
        
        ListNode first=head;
        
        ListNode fast=head;
        
        
        
        while(fast!=null && fast.next!=null){
            
            first=first.next;
            fast=fast.next.next;
            if(fast==first){
                ListNode second=head;
                
                while(second!=first){
                    second=second.next;
                    first=first.next;
                }
                
                return first;
            }
            
            
            
        }
        
        return null;
    }
}