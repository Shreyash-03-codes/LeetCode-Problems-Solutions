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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    TreeNode root=null;
    
    private void insert(int num){
       root=insert(root,num);
        
    }
    
    private TreeNode insert(TreeNode node,int num){
        if(node==null){
            return new TreeNode(num);
        }
        
        if(num<node.val){
            node.left=insert(node.left,num);
        }
        if(num>node.val){
            node.right=insert(node.right,num);
        }
        return node;
        
    }
    
    private void insertList(ArrayList<Integer> list,int start,int last){
        if(start>last){
            return;
        }
        
        int mid=(start+last)/2;
        insert(list.get(mid));
        insertList(list,start,mid-1);
        insertList(list,mid+1,last);
        
    }
    public TreeNode sortedListToBST(ListNode head) {
        
        ArrayList<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        insertList(list,0,list.size()-1);
        return root;
    }
}