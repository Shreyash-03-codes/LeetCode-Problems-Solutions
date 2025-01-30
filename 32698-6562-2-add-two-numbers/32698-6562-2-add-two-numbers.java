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
        
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();

        while(l1!=null){
            sb1.insert(0,l1.val+"");
            l1=l1.next;
        }

        while(l2!=null){
            sb2.insert(0,l2.val+"");
            l2=l2.next;
        }


        String num1=sb1.toString();
        String num2=sb2.toString();

        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        StringBuilder sb=new StringBuilder();
        while(i>=0 || j>=0 || carry>0){
            int n1=(i>=0)?num1.charAt(i)-'0':0;
            int n2=(j>=0)?num2.charAt(j)-'0':0;

            int sum=n1+n2+carry;

            carry=sum/10;

            sb.append(sum%10);
            i--;
            j--;
            
        }

        ListNode head=null;
        ListNode temp=null;

        for(char ch:sb.toString().toCharArray()){
            if(head==null){
                head=new ListNode(ch-'0');
                temp=head;
            }
            else{
                temp.next=new ListNode(ch-'0');
                temp=temp.next;
            }
        }

        return  head;
        

        
        
        
    }
}