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
    public int pairSum(ListNode head) {
        
        ArrayList<Integer> list=new ArrayList<>();
        
        ListNode node=head;
        while(node!=null){
            list.add(node.val);
            node=node.next;
        }
        
        int start=0;
        int last=list.size()-1;
        int sum=0;
        
        while(start<last){
            int s=list.get(start)+list.get(last);
            if(s>sum){
                sum=s;
            }
            start++;
            last--;
        }
        return sum;
    }
}