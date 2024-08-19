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
    public int[] nextLargerNodes(ListNode head) {
        
        ListNode temp=head;
        int size=0;
        
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        
        int[] nums=new int[size];
        int j=0;
        
        ListNode temp1=head;
        
        while(temp1!=null){
            
            ListNode temp2=temp1.next;
            boolean flag=false;
            
            while(temp2!=null){
                
                if(temp2.val>temp1.val){
                    nums[j++]=temp2.val;
                    flag=true;
                    break;
                }
                temp2=temp2.next;
            }
            
            if(!flag){
                nums[j++]=0;
            }
            
            temp1=temp1.next;
        }
        
        return nums;
        
    }
}