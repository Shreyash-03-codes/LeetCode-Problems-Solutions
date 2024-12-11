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
    public void reorderList(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> reOrder=new ArrayList<>();
        
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        
        int start=0;
        int last=list.size()-1;
        
        while(start<=last){
            if(start==last){
                reOrder.add(list.get(start));
            }
            else{
                reOrder.add(list.get(start));
                reOrder.add(list.get(last));
            }
            start++;
            last--;
        }
        
        temp=head;
        for(Integer e:reOrder){
            temp.val=e;
            temp=temp.next;
        }
    }
}