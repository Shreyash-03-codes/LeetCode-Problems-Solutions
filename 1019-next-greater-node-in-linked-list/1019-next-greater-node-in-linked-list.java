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
        ListNode node=null;
        int size=0;
        while(head!=null){
            ListNode nextNode=head.next;
            head.next=node;
            node=head;
            head=nextNode;
            size++;
        }
        int[]result=new int[size];
        size-=1;
        Stack<Integer> stack=new Stack<>();
        while(node!=null){
            while(!stack.isEmpty() && node.val>=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[size--]=0;
            }
            else{
                result[size--]=stack.peek();
            }
            stack.push(node.val);
            node=node.next;
        }
        return result;
    }
}