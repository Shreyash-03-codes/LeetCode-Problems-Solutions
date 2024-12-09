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
    public ListNode oddEvenList(ListNode head) {
        
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        int i=1;
        ListNode temp=head;
        
        while(temp!=null){
            if(i%2==1){
                odd.add(temp.val);
            }
            i++;
            temp=temp.next;
        }
        i=1;
        temp=head;
        
        while(temp!=null){
            if(i%2==0){
                even.add(temp.val);
            }
            i++;
            temp=temp.next;
        }
        temp=head;
        for(Integer e:odd){
            temp.val=e;
            temp=temp.next;
        }
        for(Integer e:even){
            temp.val=e;
            temp=temp.next;

        }
        
        return head;
    }
}