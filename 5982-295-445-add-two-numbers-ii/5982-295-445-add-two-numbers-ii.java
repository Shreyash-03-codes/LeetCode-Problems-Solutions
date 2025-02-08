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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        StringBuilder num1=new StringBuilder();
        StringBuilder num2=new StringBuilder();

        while(l1!=null){
            num1.append(l1.val+"");
            l1=l1.next;
        }

        while(l2!=null){
            num2.append(l2.val+"");
            l2=l2.next;
        }

        String n1=num1.toString();
        String n2=num2.toString();

        int i=n1.length()-1;
        int j=n2.length()-1;

        int carry=0;

        StringBuilder result=new StringBuilder();

        while(i>=0 || j>=0 || carry>0){
            int m1=(i>=0)?n1.charAt(i)-'0':0;
            int m2=(j>=0)?n2.charAt(j)-'0':0;

            int sum=m1+m2+carry;

            carry=sum/10;

            result.append(sum%10);

            i--;
            j--;
            
        }

        result.reverse();

        String res= result.toString();

        ListNode head=null;
        ListNode temp=null;

        for(char ch:res.toCharArray()){
            ListNode node=new ListNode(ch-'0');

            if(head==null){
                head=node;
                temp=head;
            }
            else{
                temp.next=node;
                temp=temp.next;
            }
        }
        return head;
        
        
        
        
    }
}