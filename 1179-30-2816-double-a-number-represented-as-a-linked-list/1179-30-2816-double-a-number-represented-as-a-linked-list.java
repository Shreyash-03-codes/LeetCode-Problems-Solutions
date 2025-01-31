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
    public ListNode doubleIt(ListNode head) {
        

        StringBuilder sb=new StringBuilder();
        StringBuilder s=new StringBuilder();
        
        ListNode temp=head;
        while(temp!=null){
            sb.append(temp.val+"");
            temp=temp.next;
        }

        String num=sb.toString();
        int i=num.length()-1;

        int carry=0;

        while(i>=0 || carry>0){
            int n=(i>=0)?num.charAt(i)-'0':0;

            int sum=(n*2)+carry;

            carry=sum/10;
            s.append(sum%10+"");
            i--;
        }

        num=s.reverse().toString();

        boolean flag=true;
        for(char ch:num.toCharArray()){
            int n=ch-'0';

            if(flag){
                head.val=n;
                temp=head;
                flag=false;
            }
            else if(temp.next==null){
                temp.next=new ListNode(n);
                temp=temp.next;
            }
            else{
                temp.next.val=n;
                temp=temp.next;
            }
        }

        return head;

    }
}