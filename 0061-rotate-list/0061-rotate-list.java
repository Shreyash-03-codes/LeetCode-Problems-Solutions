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
    public ListNode rotateRight(ListNode head, int k) {
        
        ArrayList<Integer> list=new ArrayList<>();
        ListNode node=head;
        if(head==null){
            return head;
        }
        while(node!=null){
            list.add(node.val);
            node=node.next;
        }
        
        k=k%list.size();
        
        ArrayList<Integer> result=new ArrayList<>();
        
        for(int i=list.size()-k;i<list.size();i++){
            result.add(list.get(i));
        }
        
        for(int i=0;i<list.size()-k;i++){
            result.add(list.get(i));
        }
        node=head;
        int i=0;
        while(node!=null){
            node.val=result.get(i);
            i++;
            node=node.next;
        }
        return head;
    }
}