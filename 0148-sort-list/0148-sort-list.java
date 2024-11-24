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
    public ListNode sortList(ListNode head) {
        
        if(head==null|| head.next==null){
            return head;
        }
        
        ArrayList<Integer> set=new ArrayList<>();
        
        ListNode node=head;
        while(node!=null){
            set.add(node.val);
            node=node.next;
        }
        Collections.sort(set);
        node=head;
        
        while(node!=null && !set.isEmpty()){
            int n=set.remove(0);
            node.val=n;
            node=node.next;
        }
        return head;
    }
}