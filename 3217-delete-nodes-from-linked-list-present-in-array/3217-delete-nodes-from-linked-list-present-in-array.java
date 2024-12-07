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
    public ListNode modifiedList(int[] nums, ListNode head) {

        if(head==null){
            return head;
        }

       ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        
        for(Integer e:nums){
            set.add(e);
        }
        
        ListNode node=head;
        while(node!=null){
            if(!set.contains(node.val)){
                list.add(node.val);
            }
            node=node.next;
        }
        
   
        ListNode temp=null;
        head=null;
        
        for(Integer e:list){
            if(head==null){
                head=new ListNode(e);
                temp=head;
            }
            else{
                temp.next=new ListNode(e);
                temp=temp.next;
            }
        }
        return head;
        
    }
}