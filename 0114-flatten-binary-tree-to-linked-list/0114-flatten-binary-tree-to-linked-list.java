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
    public void flatten(TreeNode root) {
        
        if(root==null){
            return;
        }
        ArrayList<Integer> list=new ArrayList<>();
        preOrder(root,list);
        int i=1;
       
        root.val=list.get(0);
        TreeNode temp=root;
        temp.left=null;
        while(i<list.size()){
            int n=list.get(i);
                i++;
          
            
            if(temp.right!=null){
                temp.right.val=n;
                temp.left=null;
                temp=temp.right;
            }
            else{
                temp.right=new TreeNode(n);
                temp.left=null;
                temp=temp.right;
            }
          
        }
    }
    private void preOrder(TreeNode node,ArrayList<Integer> list){
        if(node==null){
            return;
        }
        
        list.add(node.val);
        preOrder(node.left,list);
        preOrder(node.right,list);
        
    }
}