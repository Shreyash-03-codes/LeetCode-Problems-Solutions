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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode start=list1;
        ListNode last=list1;
      
        int k=0;
        while(k<a-1){
            start=start.next;
            k++;
        }
        last=start;
        while(k<=b){
            last=last.next;
            k++;
        }
        
        start.next=list2;
        
        ListNode temp=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=last;
        return list1;
        
        
    }
}