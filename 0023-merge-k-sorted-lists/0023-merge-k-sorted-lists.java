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
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                return a-b;
            }
        });
        
        for(ListNode list:lists){
            while(list!=null){
                pq.add(list.val);
                list=list.next;
            }
        }
        
        ListNode head=null;
        ListNode temp=null;
        
        while(!pq.isEmpty()){
            int n=pq.remove();
            if(head==null){
                head=new ListNode(n);
                temp=head;
                
            }
            else{
                temp.next=new ListNode(n);
                temp=temp.next;
               
            }
        }
        return head;
    }
}