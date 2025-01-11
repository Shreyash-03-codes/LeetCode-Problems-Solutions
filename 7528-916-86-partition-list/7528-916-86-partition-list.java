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
    public ListNode partition(ListNode head, int x) {

        ArrayList<Integer> small=new ArrayList<>();
        ArrayList<Integer> equalGreater=new ArrayList<>();

        ListNode node=head;
        while(node!=null){
            if(node.val<x){
                small.add(node.val);
            }
            else{
                equalGreater.add(node.val);
            }
            node=node.next;
        }

        ListNode temp=head;
        for(Integer e:small){
            temp.val=e;
            temp=temp.next;
        }

        for(Integer e:equalGreater){
            temp.val=e;
            temp=temp.next;
        }

        return head;
           
    }
}